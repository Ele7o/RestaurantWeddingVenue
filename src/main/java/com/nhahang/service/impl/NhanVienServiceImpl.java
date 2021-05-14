/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.NhanVien;
import com.nhahang.repository.NhanVienRepository;
import com.nhahang.service.NhanVienService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author X_X
 */
@Service
public class NhanVienServiceImpl implements NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;
    
    @Override
    public List<NhanVien> getNhanViens(){
        return this.nhanVienRepository.getNhanViens();
    }
    @Override
    public List<NhanVien> getNhanViens(String kw){
        return this.nhanVienRepository.getNhanViens(kw);
    }
    @Override
    public List<NhanVien> getNhanVienById2(String kw){
        return this.nhanVienRepository.getNhanVienById2(kw);
    }

    @Override
    public boolean deleteNhanVien(int idNhanVien) {
       return this.nhanVienRepository.deleteNhanVien(idNhanVien);
    }

    @Override
    public boolean addOrUpdateNhanVien(NhanVien nhanVien) {
       return this.nhanVienRepository.addOrUpdateNhanVien(nhanVien);
    }

    @Override
    public NhanVien getNhanVienById(int idNhanVien) {
        return this.nhanVienRepository.getNhanVienById(idNhanVien);
    }
    @Override
    public NhanVien getNhanVienByName(String tenNhanVien){
        return this.nhanVienRepository.getNhanVienByName(tenNhanVien);
    }
}
