/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.DonHang_DichVu;
import com.nhahang.repository.DonHang_DichVuRepository;
import com.nhahang.service.DichVuService;
import com.nhahang.service.DonHangService;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author btson
 */
@Repository
public class DonHang_DichVuRepositoryImpl implements DonHang_DichVuRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private DonHangService donHangService;
    @Autowired
    private DichVuService dichVuService;
    

    @Override
    @Transactional
    public List<DonHang_DichVu> getDonHang_DichVus(String kw) {
       Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<DonHang_DichVu> query = builder.createQuery(DonHang_DichVu.class);
        Root root= query.from(DonHang_DichVu.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("idDonHangDichVu").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();
    }   

    @Override
    @Transactional
    public List<DonHang_DichVu> getDonHang_DichVus() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM DonHang_DichVu");
        return q.getResultList();
    }

    @Override
    @Transactional
    public DonHang_DichVu getDonHang_DichVu(int idDh_Dv) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(DonHang_DichVu.class, idDh_Dv);
    }

    @Override
    @Transactional
    public boolean addOrUpdateDh_Dv(DonHang_DichVu donHang_dichVu) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(donHang_dichVu.getIdDonHangDichVu() > 0){
                donHang_dichVu.setDichVu2(this.dichVuService.getDichVuById(donHang_dichVu.getIdDichVuForm2()));
                donHang_dichVu.setDonHang2(this.donHangService.getDonHangById(donHang_dichVu.getIdDonHangForm2()));
                s.update(donHang_dichVu);
            }
            else{
                donHang_dichVu.setDichVu2(this.dichVuService.getDichVuById(donHang_dichVu.getIdDichVuForm2()));
                donHang_dichVu.setDonHang2(this.donHangService.getDonHangById(donHang_dichVu.getIdDonHangForm2()));
                s.save(donHang_dichVu);
            }
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean deleteDonHangDichVu(int idDonHangDichVu) {
       try{
           Session s =this.sessionFactory.getObject().getCurrentSession();
           s.delete(s.get(DonHang_DichVu.class, idDonHangDichVu));
           
           return true;
       }catch(HibernateException e){
           e.printStackTrace();
       }
       return false;
    }
}
