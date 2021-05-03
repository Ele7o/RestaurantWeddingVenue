/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.service.impl;

import com.nhahang.pojo.Mon;
import com.nhahang.repository.MonRepository;
import com.nhahang.service.MonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author X_X
 */
public class MonServiceImpl implements MonService{
    @Autowired
    private MonRepository monRepository;
    
    @Override
    public List<Mon> getMon() {
        return this.monRepository.getMon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mon getMonById(int idMon) {
       return this.monRepository.getMonById(idMon); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
