package com.new_buildings.dao.impl;

import com.new_buildings.dao.interfaces.NewBuildingDAO;
import com.new_buildings.entities.NewBuilding;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Component
public class NewBuildingDAOImpl implements NewBuildingDAO {

    private final SessionFactory sessionFactory;

    public NewBuildingDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Set<NewBuilding> findAll() {
        Session session = sessionFactory.getCurrentSession();
//        Set<NewBuilding> newBuildings  = session.createQuery("from new_buildings").list();
        return null;
    }

    @Override
    public NewBuilding findById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        NewBuilding newBuilding = session.find(NewBuilding.class, aLong);
        return newBuilding;
    }

    @Override
    public NewBuilding save(NewBuilding object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }

    @Override
    public void delete(NewBuilding object) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(aLong);
    }
}
