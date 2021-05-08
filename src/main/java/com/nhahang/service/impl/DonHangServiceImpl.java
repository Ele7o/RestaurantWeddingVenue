/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.DonHang;
import com.nhahang.repository.DonHangRepository;
import com.nhahang.service.DonHangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author btson
 */
@Service
public class DonHangServiceImpl implements DonHangService{
    
    @Autowired
    private DonHangRepository donHangRepository;
    
    @Override
    public List<DonHang> getDonHangs(){
        return this.donHangRepository.getDonHangs();
    }
    @Override
    public DonHang getDonHangById(int idDonHang){
        return this.donHangRepository.getDonHangById(idDonHang);
    }

    @Override
    public boolean addOrUpdateDonHang(DonHang donHang) {
        return this.donHangRepository.addOrUpdateDonHang(donHang);
    }
}
