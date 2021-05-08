/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.PhanHoi;
import com.nhahang.repository.PhanHoiRepository;
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
public class PhanHoiRepositoryImpl implements PhanHoiRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<PhanHoi> getPhanHoi() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From PhanHoi");
        return q.getResultList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public PhanHoi getPhanHoiById(int idPhanHoi) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(PhanHoi.class, idPhanHoi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdatePhanHoi(PhanHoi phanHoi) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(phanHoi.getIdPhanHoi() > 0){
                s.update(phanHoi);
            }
            else{
                s.save(phanHoi);
            }
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
}
