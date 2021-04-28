package com.nhahang.repository.impl;

import com.nhahang.pojo.NghiepVu;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.nhahang.repository.NghiepVuRepository;
import javax.persistence.Query;
import java.util.List;

@Repository
public class NghiepVuRepositoryImpl implements NghiepVuRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<NghiepVu> getNghiepVu(){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From NghiepVu");
        return q.getResultList();
    }


}
