package com.users.dao.impl;

import com.users.dao.interfaces.UserDAO;
import com.users.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Set;

@Component
public class UserDAOImpl implements UserDAO {

    private final SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.find(User.class, aLong);
        return user;
    }

    @Override
    public User save(User object) {
        return null;
    }

    @Override
    public void delete(User object) {

    }

}
