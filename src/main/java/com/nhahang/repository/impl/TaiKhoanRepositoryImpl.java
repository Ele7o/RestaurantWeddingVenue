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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author X_X
 */
@Repository
public class TaiKhoanRepositoryImpl implements TaiKhoanRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Override
    @Transactional
    public List<TaiKhoan> getTaiKhoans(String tenTaiKhoan) {
        Session session;
        session = this.sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TaiKhoan> query = builder.createQuery(TaiKhoan.class);
        Root root = query.from(TaiKhoan.class);
        query = query.select(root);
        
        Predicate predicte = builder.equal(root.get("tenTaiKhoan").as(String.class), tenTaiKhoan.trim());
        query = query.where(predicte);
        
        org.hibernate.query.Query result = session.createQuery(query);
        return result.getResultList();
    }

    @Override
    @Transactional
    public boolean addTaiKhoan(TaiKhoan taiKhoan) {
        Session session;
        session = this.sessionFactory.getObject().getCurrentSession();
        if (!this.getTaiKhoans(taiKhoan.getTenTaiKhoan()).isEmpty()) {
            return false;
        }
        try {
           taiKhoan.setMatKhau(this.passwordEncoder.encode(taiKhoan.getMatKhau()));
           session.save(taiKhoan);
           return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
}
