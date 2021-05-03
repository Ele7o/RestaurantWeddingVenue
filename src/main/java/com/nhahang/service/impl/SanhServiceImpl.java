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

/**
 *
 * @author X_X
 */
public class SanhServiceImpl implements SanhService {
    @Autowired
    private SanhRepository sanhRepository;
    
    @Override
    public List<Sanh> getSanh() {
        return this.sanhRepository.getSanh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sanh getSanhById(int idSanh) {
        return this.sanhRepository.getSanhById(idSanh); //To change body of generated methods, choose Tools | Templates.
    }
    
}
