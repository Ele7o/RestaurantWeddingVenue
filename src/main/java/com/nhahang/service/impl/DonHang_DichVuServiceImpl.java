/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.DonHang_DichVu;
import com.nhahang.repository.DonHang_DichVuRepository;
import com.nhahang.service.DonHang_DichVuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author btson
 */
@Service
public class DonHang_DichVuServiceImpl implements DonHang_DichVuService{
    @Autowired
    private DonHang_DichVuRepository donHang_dichVuRepository;
    @Override
    public List<DonHang_DichVu> getDonHang_DichVus(String kw) {
        return this.donHang_dichVuRepository.getDonHang_DichVus(kw);
    }

    @Override
    public List<DonHang_DichVu> getDonHang_DichVus() {
        return this.donHang_dichVuRepository.getDonHang_DichVus();
    }

    @Override
    public DonHang_DichVu getDonHang_DichVu(int idDh_Dv) {
       return this.donHang_dichVuRepository.getDonHang_DichVu(idDh_Dv);
    }

    @Override
    public boolean addOrUpdateDh_Dv(DonHang_DichVu donHang_dichVu) {
        return this.donHang_dichVuRepository.addOrUpdateDh_Dv(donHang_dichVu);
    }

    @Override
    public boolean deleteDonHangDichVu(int idDonHangDichVu) {
        return this.donHang_dichVuRepository.deleteDonHangDichVu(idDonHangDichVu);
    }
    
}
