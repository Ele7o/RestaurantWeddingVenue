/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.TaiKhoan;
import com.nhahang.repository.TaiKhoanRepository;
import com.nhahang.service.TaiKhoanService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author X_X
 */
@Service("userDetailsService")
public class TaiKhoanServiceImpl implements TaiKhoanService{
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired 
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Override
    public boolean addTaiKhoan(TaiKhoan taiKhoan) {
        taiKhoan.setMatKhau(bCryptPasswordEncoder.encode(taiKhoan.getMatKhau())); 
        return this.taiKhoanRepository.addTaiKhoan(taiKhoan);
    }
    
    @Override
    @Transactional(readOnly = true)
    public TaiKhoan getTaiKhoanByTenTaiKhoan(String tenTaiKhoan) {
        return taiKhoanRepository.getTaiKhoans(tenTaiKhoan).get(0);
}
   
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String tenTaiKhoan) throws UsernameNotFoundException {
        List<TaiKhoan> taiKhoans = taiKhoanRepository.getTaiKhoans(tenTaiKhoan);
        if (taiKhoans.isEmpty())
            throw new UsernameNotFoundException("Không tồn tại!"); 
        TaiKhoan taiKhoan = taiKhoans.get(0);
        
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(taiKhoan.getRole()));
        
        return new org.springframework.security.core.userdetails.User(
                taiKhoan.getTenTaiKhoan(), taiKhoan.getMatKhau(), authorities);
    }



    
}
