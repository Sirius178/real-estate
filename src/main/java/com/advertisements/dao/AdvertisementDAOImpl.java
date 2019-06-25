package com.advertisements.dao;

import com.advertisements.entities.Advertisement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public class AdvertisementDAOImpl implements AdvertisementDAO {

    private SessionFactory sessionFactory;

    public AdvertisementDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Advertisement> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Advertisement> advertisements = session.createNativeQuery("select * from advertisements",Advertisement.class).list();
        return advertisements;
    }

    @Override
    public Advertisement findById(Long aLong) {
        return null;
    }

    @Override
    public Advertisement save(Advertisement object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }

    @Override
    public void delete(Advertisement object) {

    }


}
