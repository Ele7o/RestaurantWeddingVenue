/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.DichVu;

import com.nhahang.repository.DichVuRepository;
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
 * @author btson
 */
@Repository
public class DichVuRepositoryImpl implements DichVuRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<DichVu> getDichVus(){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From DichVu");
        return q.getResultList();
    }
    @Override
    @Transactional
    public List<DichVu> getDichVuById2(String kw){
         Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<DichVu> query = builder.createQuery(DichVu.class);
        Root root= query.from(DichVu.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("idDichVu").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();
    }
    @Override
    @Transactional
    public List<DichVu> getDichVuByName(String kw){
         Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<DichVu> query = builder.createQuery(DichVu.class);
        Root root= query.from(DichVu.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("tenDichVu").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();
    }
    @Override
    @Transactional
    public DichVu getDichVuById(int idDichVu){
        Session s  = this.sessionFactory.getObject().getCurrentSession();
        return s.get(DichVu.class, idDichVu);
    }
    @Override
    @Transactional
    public boolean addOrUpdateDichVu(DichVu dichVu){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(dichVu.getIdDichVu() > 0){
                s.update(dichVu);
            }
            else{
                s.save(dichVu);
            }
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean deleteDichVu(int idDichVu) {
        try{
            Session s = this.sessionFactory.getObject().getCurrentSession();
            s.delete(s.get(DichVu.class, idDichVu));
            
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
}
