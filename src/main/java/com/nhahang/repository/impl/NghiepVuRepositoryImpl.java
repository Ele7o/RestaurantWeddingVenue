package com.nhahang.repository.impl;

import com.nhahang.pojo.NghiepVu;
import com.nhahang.pojo.NhanVien;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.nhahang.repository.NghiepVuRepository;
import javax.persistence.Query;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;

@Repository
public class NghiepVuRepositoryImpl implements NghiepVuRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<NghiepVu> getNghiepVu() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From NghiepVu");
        return q.getResultList();
    }

    @Override
    @Transactional
    public NghiepVu getNghiepVuById(int idNghiepVu) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(NghiepVu.class, idNghiepVu);
    }

    @Override
    public boolean addOrUpdateNghiepVu(NghiepVu nghiepVu) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(nghiepVu.getIdNghiepVu() > 0){
                s.update(nghiepVu);
            }
            else{
                s.save(nghiepVu);
            }
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return false;
    }

}
