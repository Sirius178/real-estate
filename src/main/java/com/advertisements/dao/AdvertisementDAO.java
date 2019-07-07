package com.advertisements.dao;

import com.advertisements.entities.Advertisement;
import com.parent.CrudService;

import java.util.List;

public interface AdvertisementDAO extends CrudService<Advertisement, Long> {

    List<Advertisement> findAllSell();
    List<Advertisement> findAllRent();
}
