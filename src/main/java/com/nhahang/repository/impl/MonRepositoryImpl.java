/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhahang.repository.impl;

import com.nhahang.pojo.Mon;
import com.nhahang.repository.MonRepository;
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
public class MonRepositoryImpl implements MonRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<Mon> getMon() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From Mon");
        return q.getResultList();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Mon getMonById(int idMon) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(Mon.class, idMon);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdateMon(Mon mon) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(mon.getIdMon() > 0){
                s.update(mon);
            }
            else{
                s.save(mon);
            }
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
