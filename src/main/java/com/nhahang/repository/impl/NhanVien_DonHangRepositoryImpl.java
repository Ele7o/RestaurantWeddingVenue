/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.NhanVien_DonHang;
import com.nhahang.repository.NhanVien_DonHangRepository;
import com.nhahang.service.DonHangService;
import com.nhahang.service.NhanVienService;
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
public class NhanVien_DonHangRepositoryImpl implements NhanVien_DonHangRepository{
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private DonHangService donHangService;
    
    @Override
    @Transactional
    public List<NhanVien_DonHang> getNhanVien_DonHangs(String kw) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
       
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<NhanVien_DonHang> query = builder.createQuery(NhanVien_DonHang.class);
        Root root= query.from(NhanVien_DonHang.class);
        query.select(root);
        
        if(kw != null && !kw.isEmpty()){
            Predicate p = builder.like(root.get("idNhanVienDonHang").as(String.class), String.format("%%%s%%",kw));
            
            query = query.where(p);
        }
        Query q = s.createQuery(query);
        return q.getResultList();}

    @Override
    @Transactional
    public List<NhanVien_DonHang> getNhanVien_DonHangs() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM NhanVien_DonHang");
        return q.getResultList();
    }

    @Override
    @Transactional
    public NhanVien_DonHang getNhanVien_DonHangById(int idNhanVienDonHang) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(NhanVien_DonHang.class, idNhanVienDonHang);
    }

    @Override
    @Transactional
    public boolean addOrUpdateNv_Dh(NhanVien_DonHang nhanVien_donHang) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(nhanVien_donHang.getIdNhanVienDonHang() > 0){
                nhanVien_donHang.setNhanVien2(this.nhanVienService.getNhanVienById(nhanVien_donHang.getIdNhanVienForm2()));
                nhanVien_donHang.setDonHang3(this.donHangService.getDonHangById(nhanVien_donHang.getIdDonHangForm2()));
                s.update(nhanVien_donHang);
            }
            else{
                nhanVien_donHang.setNhanVien2(this.nhanVienService.getNhanVienById(nhanVien_donHang.getIdNhanVienForm2()));
                nhanVien_donHang.setDonHang3(this.donHangService.getDonHangById(nhanVien_donHang.getIdDonHangForm2()));
                s.save( nhanVien_donHang);
            }
            return true;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
     }

    @Override
    @Transactional
    public boolean deleteNhanVienDonHang(int idNhanVienDonHang) {
        try{
           Session s =this.sessionFactory.getObject().getCurrentSession();
           s.delete(s.get(NhanVien_DonHang.class, idNhanVienDonHang));
           
           return true;
       }catch(HibernateException e){
           e.printStackTrace();
       }
       return false;
       }
    
}
