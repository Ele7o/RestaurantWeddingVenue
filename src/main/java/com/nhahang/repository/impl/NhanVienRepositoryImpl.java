/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.NhanVien;
import com.nhahang.pojo.NghiepVu;
import com.nhahang.repository.NhanVienRepository;
import com.nhahang.repository.NghiepVuRepository;
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
public class NhanVienRepositoryImpl implements NhanVienRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private NghiepVuRepository nghiepVuRepo;
    
    
    @Override
    @Transactional
    public List<NhanVien> getNhanViens() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From NhanVien");
        return q.getResultList();
    }
    
    @Override
    @Transactional
    public List<NhanVien> getNhanViens(String kw){
        Session session = this.sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<NhanVien> query = builder.createQuery(NhanVien.class);
        Root root = query.from(NhanVien.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("tenNhanVien").as(String.class), 
                                            String.format("%%%s%%", kw));
            query = query.where(p);
        }
        Query q = session.createQuery(query);
        return q.getResultList();
    }
    
    @Override
    @Transactional
    public boolean deleteNhanVien(int idNhanVien){
        try{
            Session s = this.sessionFactory.getObject().getCurrentSession();
            s.delete(s.get(NhanVien.class, idNhanVien));
            
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
    @Override
    @Transactional
    public boolean addOrUpdateNhanVien(NhanVien nhanVien){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(nhanVien.getIdNhanVien() > 0){
//                nhanVien.setNghiepVu();
                nhanVien.setNghiepVu(this.nghiepVuRepo.getNghiepVuById(nhanVien.getIdNghiepVuForm()));
                
                s.update(nhanVien);
            }
            else{
                nhanVien.setNghiepVu(this.nghiepVuRepo.getNghiepVuById(nhanVien.getIdNghiepVuForm()));  
                s.save(nhanVien);
            }
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
    @Override
    @Transactional
    public NhanVien getNhanVienById(int idNhanVien){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        
        return s.get(NhanVien.class, idNhanVien);
    }

    
}
