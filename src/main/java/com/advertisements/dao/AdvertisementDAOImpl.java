package com.advertisements.dao;

import com.advertisements.entities.Advertisement;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class AdvertisementDAOImpl implements AdvertisementDAO {


    @Override
    public Set<Advertisement> findAll() {
        return null;
    }

    @Override
    public Advertisement findById(Long aLong) {
        return null;
    }

    @Override
    public Advertisement save(Advertisement object) {
        return null;
    }

    @Override
    public void delete(Advertisement object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
