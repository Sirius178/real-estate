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

    private static Session session;

    
    public Address findCommandById(Long id) {
        session = sessionFactory.getCurrentSession();
        return session.load(Address.class, new Long(id));
    }
    @Transactional
    @Override
    public Address saveAddressCommand(Address object) {
        session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }
    @Transactional
    @Override
    public List<Address> findAll() {
        session = sessionFactory.getCurrentSession();
        List<Address> addresses = session.createNativeQuery("select * from addresses", Address.class).list();
        return addresses;
    }

    @Transactional
    public Address findById(Long id) {

        session = sessionFactory.getCurrentSession();
        Address address = session.load(Address.class, new Long(id));
        return address;
    }
    @Transactional
    @Override
    public Address save(Address object) {
        return null;
    }
    @Transactional
    @Override
    public void delete(Address object) {

    }
    @Transactional
    @Override
    public void deleteById(Long aLong) {

    }
}
