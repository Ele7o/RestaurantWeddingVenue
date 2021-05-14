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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
    public List<KhachHang> getKhachHangById2(String kw){
         Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<KhachHang> query = builder.createQuery(KhachHang.class);
        Root root= query.from(KhachHang.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("idKhachHang").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();
    }
    @Override
    @Transactional
    public List<KhachHang> getKhachHangByName(String kw){
        Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<KhachHang> query = builder.createQuery(KhachHang.class);
        Root root= query.from(KhachHang.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("tenKhachHang").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();
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
            return true;
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
