/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.TaiKhoan;
import com.nhahang.repository.TaiKhoanRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author X_X
 */
public class TaiKhoanRepositoryImpl implements TaiKhoanRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<TaiKhoan> getTaiKhoans(String tenTaiKhoan) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From TaiKhoan");
        return q.getResultList();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void addTaiKhoan(TaiKhoan taiKhoan) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            s.save(taiKhoan);
        }catch(HibernateException e){
            e.printStackTrace();
        }
    }
    
}
