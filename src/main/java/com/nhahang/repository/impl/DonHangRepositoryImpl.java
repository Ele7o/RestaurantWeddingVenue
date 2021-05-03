/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.DonHang;
import com.nhahang.repository.DonHangRepository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author btson
 */
public class DonHangRepositoryImpl implements DonHangRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<DonHang> getDonHangs(){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM DonHang");
        return q.getResultList();
    }
    @Override
    @Transactional
    public DonHang getDonHangById(int idDonHang){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(DonHang.class, idDonHang);
        
    }
}
