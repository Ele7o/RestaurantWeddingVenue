/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.KhachHang;
import com.nhahang.repository.KhachHangRepository;
import com.nhahang.service.KhachHangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author X_X
 */
@Service
public class KhachHangServiceImpl implements KhachHangService{
    @Autowired
    private KhachHangRepository khachHangRepository;
    
    @Override
    public List<KhachHang> getKhachHang() {
        return this.khachHangRepository.getKhachHang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang getKhachHangById(int idKhachHang) {
        return this.khachHangRepository.getKhachHangById(idKhachHang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdateKhachHang(KhachHang khachHang) {
        return this.khachHangRepository.addOrUpdateKhachHang(khachHang);
    }

    @Override
    public boolean deleteKhachHang(int idKhachHang) {
        return this.khachHangRepository.deleteKhachHang(idKhachHang);
    }
    
}
