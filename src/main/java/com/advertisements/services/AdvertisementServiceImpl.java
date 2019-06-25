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
    //       todo service
    @Override
    public List<Advertisement> findAll() {
        return null;
    }

    @Override
    public Advertisement findById(Long aLong) {
        return null;
    }

    @Override
    public Advertisement save(Advertisement object) {
        advertisementDAO.save(object);
        return object;
    }

    @Override
    public void delete(Advertisement object) {

    }

}
