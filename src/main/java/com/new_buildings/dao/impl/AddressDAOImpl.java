package com.new_buildings.dao.impl;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.dao.interfaces.AddressDAO;
import com.new_buildings.entities.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
@Transactional
@Repository
public class AddressDAOImpl implements AddressDAO {

    private final SessionFactory sessionFactory;

    public AddressDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;


    @Override
    public Address findCommandById(Long id) {
        return null;
    }

    @Override
    public Address saveAddressCommand(Address object) {
        session = sessionFactory.getCurrentSession();
        System.out.println(object.toString());
        session.save(object);
        return object;
    }

    @Override
    public Set<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Long aLong) {
        return null;
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
