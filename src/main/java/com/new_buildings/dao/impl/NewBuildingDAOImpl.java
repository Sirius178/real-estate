package com.new_buildings.dao.impl;

import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.dao.interfaces.NewBuildingDAO;
import com.new_buildings.entities.NewBuilding;
import lombok.extern.java.Log;
import org.hibernate.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class NewBuildingDAOImpl implements NewBuildingDAO {
    private Logger logger = LoggerFactory.getLogger(NewBuildingDAOImpl.class);
    private final SessionFactory sessionFactory;


    public NewBuildingDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;


//    public List<NewBuilding> findAll() {
//
//        List<NewBuilding> newBuildings = null;
//        try {
//            session = sessionFactory.getCurrentSession();
//            sessionFactory.openSession();
//            session.beginTransaction();
//            newBuildings = session.createNativeQuery("SELECT * FROM new_buildings", NewBuilding.class).list();
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
////        List<NewBuilding> newBuildings  = session.createQuery("from new_buildings").list();
//        return newBuildings;
//    }
    @Transactional
    @Override
    public List<NewBuilding> findAll() {
        session = sessionFactory.getCurrentSession();
        List<NewBuilding> newBuildings = session.createNativeQuery("select * from new_buildings",NewBuilding.class).list();
        System.out.println(newBuildings);
        return newBuildings;
    }

    @Transactional
    public NewBuilding findById(Long aLong) {
        session = sessionFactory.getCurrentSession();
        NewBuilding newBuilding = session.find(NewBuilding.class, aLong);
        return newBuilding;
    }

    @Transactional
    public NewBuilding save(NewBuilding object) {
//        session = sessionFactory.getCurrentSession();
//        session.save(object);
//        return object;
        return null;
    }

    @Transactional
    public void delete(NewBuilding object) {
        session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    @Transactional
    public void deleteById(Long aLong) {
        session = sessionFactory.getCurrentSession();
        session.delete(aLong);
    }

    @Override
    public NewBuilding findCommandById(Long id) {
        return null;
    }

    @Transactional
    public NewBuilding saveNewBuildingCommand(NewBuilding object) {
        session = sessionFactory.getCurrentSession();
        System.out.println(object.toString());
        session.save(object);
        return object;
    }
}
