package com.users.services.impl;

import com.users.dao.interfaces.UserDAO;
import com.users.entities.User;
import com.users.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long aLong) {
        return userDAO.findById(aLong);
    }

    @Override
    public User save(User object) {
        return null;
    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
