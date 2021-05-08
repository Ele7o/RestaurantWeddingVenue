/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.KhachHang;
import com.nhahang.repository.KhachHangRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author X_X
 */
@Repository
public class KhachHangRepositoryImpl implements KhachHangRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<KhachHang> getKhachHang() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From KhachHang");
        return q.getResultList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public KhachHang getKhachHangById(int idKhachHang) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(KhachHang.class, idKhachHang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public boolean addOrUpdateKhachHang(KhachHang khachHang) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(khachHang.getIdKhachHang() > 0){
                s.update(khachHang);
            }
            else{
                s.save(khachHang);
            }
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    @Transactional
    public boolean deleteKhachHang(int idKhachHang) {
        try{
            Session s = this.sessionFactory.getObject().getCurrentSession();
            s.delete(s.get(KhachHang.class, idKhachHang));
            
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
