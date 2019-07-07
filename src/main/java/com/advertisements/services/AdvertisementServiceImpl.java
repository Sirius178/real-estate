package com.advertisements.services;

import com.advertisements.dao.AdvertisementDAO;
import com.advertisements.entities.Advertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    private AdvertisementDAO advertisementDAO;

    public AdvertisementServiceImpl(AdvertisementDAO advertisementDAO) {
        this.advertisementDAO = advertisementDAO;
    }

    @Override
    public List<Advertisement> findAll() {
        return advertisementDAO.findAll();
    }

    @Override
    public Advertisement findById(Long aLong) {
        return advertisementDAO.findById(aLong);
    }

    @Override
    public Advertisement save(Advertisement object) {
        advertisementDAO.save(object);
        return object;
    }

    @Override
    public void delete(Advertisement object) {
        advertisementDAO.delete(object);
    }

    @Override
    public List<Advertisement> findAllSell() {
        return advertisementDAO.findAllSell();
    }

    @Override
    public List<Advertisement> findAllRent() {
        return advertisementDAO.findAllRent();
    }
}
