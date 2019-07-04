package com.new_buildings.dao.impl;


import com.new_buildings.dao.interfaces.AddressDAO;
import com.new_buildings.entities.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class AddressDAOImpl implements AddressDAO {

    private final SessionFactory sessionFactory;

    public AddressDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Transactional
    @Override
    public List<Address> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Address> addresses = session.createNativeQuery("select * from addresses", Address.class).list();
        return addresses;
    }

    @Transactional
    public Address findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.load(Address.class, new Long(id));
    }
    @Transactional
    @Override
    public Address save(Address object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }
    @Transactional
    @Override
    public void delete(Address object) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(object);

    }

}
