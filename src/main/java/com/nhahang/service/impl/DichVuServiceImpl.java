/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.DichVu;
import com.nhahang.repository.DichVuRepository;
import com.nhahang.service.DichVuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author btson
 */
@Service
public class DichVuServiceImpl implements DichVuService{
    @Autowired
    private DichVuRepository dichVuRepository;
    
    @Override
    public List<DichVu> getDichVus( ){
        return this.dichVuRepository.getDichVus();
    }
    
    @Override
    public DichVu getDichVuById (int idDichVu){
        return this.dichVuRepository.getDichVuById(idDichVu);
    }
    @Override
    public boolean addOrUpdateDichVu(DichVu dichVu){
        return this.dichVuRepository.addOrUpdateDichVu(dichVu);
    }
    
    
    
    
}
