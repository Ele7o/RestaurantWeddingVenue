/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.PhanHoi;
import com.nhahang.repository.PhanHoiRepository;
import com.nhahang.service.PhanHoiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author X_X
 */
@Service
public class PhanHoiServiceImpl implements PhanHoiService{
    @Autowired
    private PhanHoiRepository phanHoiRepository;
    
    @Override
    public List<PhanHoi> getPhanHoi(String kw){
        return this.phanHoiRepository.getPhanHoi(kw);
    }
    @Override
    public List<PhanHoi> getPhanHoiByType(String kw){
        return this.phanHoiRepository.getPhanHoiByType(kw);
    }
    @Override
    public List<PhanHoi> getPhanHoi() {
        return this.phanHoiRepository.getPhanHoi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhanHoi getPhanHoiById(int idPhanHoi) {
        return this.phanHoiRepository.getPhanHoiById(idPhanHoi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdatePhanHoi(PhanHoi phanHoi) {
        return this.phanHoiRepository.addOrUpdatePhanHoi(phanHoi);
    }

    @Override
    public boolean deletePhanHoi(int idPhanHoi) {
        return this.phanHoiRepository.deletePhanHoi(idPhanHoi);
    }
    
}
