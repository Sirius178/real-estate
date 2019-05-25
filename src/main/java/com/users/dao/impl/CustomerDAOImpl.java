package com.users.dao.impl;

import com.users.dao.interfaces.CustomerDAO;
import com.users.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class CustomerDAOImpl implements CustomerDAO {


    @Override
    public Set findAll() {
        return null;
    }

    @Override
    public Object findById(Object o) {
        return null;
    }

    @Override
    public Object save(Object object) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteById(Object o) {

    }
}
