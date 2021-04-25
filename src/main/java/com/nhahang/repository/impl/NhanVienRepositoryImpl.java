/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.NhanVien;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
public class NhanVienRepositoryImpl {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
//    @Override
//    @Transactional
//    public List<NhanVien> getNhanVien(String kw){
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<NhanVien> query = builder.createQuery(NhanVien.class);
//        Root root = query.from(NhanVien.class);
//        query.select(root);
//
//        if (kw != null && !kw.isEmpty())
//        {
//            Predicate p = builder.like(root.get("tenNhanVien").as(String.class), String.format("%%%s%%", kw));
//            query = query.where(p);
//        }
//
//        Query q = session.createQuery(query);
//        return q.getResultList();
//    }
}
