/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.Sanh;
import com.nhahang.repository.SanhRepository;
import com.nhahang.service.SanhService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author X_X
 */
@Service
public class SanhServiceImpl implements SanhService {
    @Autowired
    private SanhRepository sanhRepository;
    
    @Override
    public List<Sanh> getSanh(){
        return this.sanhRepository.getSanh();
    }
    @Override
    public List<Sanh> getSanh(String idSanh) {
        return this.sanhRepository.getSanh(idSanh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sanh getSanhById(int idSanh) {
        return this.sanhRepository.getSanhById(idSanh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdateSanh(Sanh sanh) {
       return this.sanhRepository.addOrUpdateSanh(sanh);
    }

    @Override
    public boolean deleteSanh(int idSanh) {
       return this.sanhRepository.deleteSanh(idSanh);
    }
    
}
