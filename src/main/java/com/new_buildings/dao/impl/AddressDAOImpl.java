package com.new_buildings.dao.impl;


import com.new_buildings.dao.interfaces.AddressDAO;
import com.new_buildings.entities.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AddressDAOImpl implements AddressDAO {

    private final SessionFactory sessionFactory;

    public AddressDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    
    public Address findCommandById(Long id) {
        session = sessionFactory.getCurrentSession();
        return session.load(Address.class, new Long(id));
    }

    @Override
    public Address saveAddressCommand(Address object) {
        session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }

    @Override
    public List<Address> findAll() {
        session = sessionFactory.getCurrentSession();
        List<Address> addresses = session.createNativeQuery("select * from addresses", Address.class).list();
        return addresses;
    }

    @Override
    public Address findById(Long aLong) {
        session = sessionFactory.getCurrentSession();
        Address address = session.load(Address.class, new Long(aLong));
        return address;
    }

    @Override
    public Address save(Address object) {
        return null;
    }

    @Override
    public void delete(Address object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
