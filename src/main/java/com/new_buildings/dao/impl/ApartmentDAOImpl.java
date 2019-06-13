package com.new_buildings.dao.impl;

import com.new_buildings.dao.interfaces.ApartmentDAO;
import com.new_buildings.entities.Apartment;
import org.hibernate.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ApartmentDAOImpl implements ApartmentDAO {
    private Logger logger = LoggerFactory.getLogger(ApartmentDAOImpl.class);
    private final SessionFactory sessionFactory;


    public ApartmentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;


//    public List<Apartment> findAll() {
//
//        List<Apartment> newBuildings = null;
//        try {
//            session = sessionFactory.getCurrentSession();
//            sessionFactory.openSession();
//            session.beginTransaction();
//            newBuildings = session.createNativeQuery("SELECT * FROM new_buildings", Apartment.class).list();
//            session.getTransaction().commit();
//
//        } catch (Exception e) {
//
//            session.getTransaction().rollback();
//            logger.error("msg error: cannot get list of new buildings", e);
////            e.printStackTrace();
//        } finally {
//            session.close();
//            sessionFactory.close();
//        }
//        System.out.println(newBuildings);
////        List<Apartment> newBuildings  = session.createQuery("from new_buildings").list();
//        return newBuildings;
//    }
    @Transactional
    @Override
    public List<Apartment> findAll() {
        session = sessionFactory.getCurrentSession();
        List<Apartment> apartments = session.createNativeQuery("select * from apartments", Apartment.class).list();
        System.out.println(apartments);
        return apartments;
    }

    @Transactional
    public Apartment findById(Long aLong) {
        session = sessionFactory.getCurrentSession();
        Apartment apartment = session.find(Apartment.class, aLong);
        return apartment;
    }

    @Transactional
    public Apartment save(Apartment object) {
//        session = sessionFactory.getCurrentSession();
//        session.save(object);
//        return object;
        return null;
    }

    @Transactional
    public void delete(Apartment object) {
        session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    @Transactional
    public void deleteById(Long aLong) {
        session = sessionFactory.getCurrentSession();
        session.delete(aLong);
    }

    @Override
    public Apartment findCommandById(Long id) {
        return null;
    }

    @Transactional
    public Apartment saveApartmentCommand(Apartment object) {
        session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }
}
