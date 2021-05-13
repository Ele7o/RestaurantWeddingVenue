/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.NhanVien_DonHang;
import com.nhahang.repository.NhanVien_DonHangRepository;
import com.nhahang.service.NhanVien_DonHangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author btson
 */
@Service
public class NhanVien_DonHangServiceImpl implements NhanVien_DonHangService{

    @Autowired
    private NhanVien_DonHangRepository nhanVien_donHangRepository;
    @Override
    public List<NhanVien_DonHang> getNhanVien_DonHangs(String kw) {
        return this.nhanVien_donHangRepository.getNhanVien_DonHangs(kw);
    }

    @Override
    public List<NhanVien_DonHang> getNhanVien_DonHangs() {
        return this.nhanVien_donHangRepository.getNhanVien_DonHangs();
    }

    @Override
    public NhanVien_DonHang getNhanVien_DonHangById(int idNhanVienDonHang) {
       return this.nhanVien_donHangRepository.getNhanVien_DonHangById(idNhanVienDonHang);
    }

    @Override
    public boolean addOrUpdateNv_Dh(NhanVien_DonHang nhanVien_donHang) {
        return this.nhanVien_donHangRepository.addOrUpdateNv_Dh(nhanVien_donHang);
    }

    @Override
    public boolean deleteNhanVienDonHang(int idNhanVienDonHang) {
        return this.nhanVien_donHangRepository.deleteNhanVienDonHang(idNhanVienDonHang);
    }
    
}
