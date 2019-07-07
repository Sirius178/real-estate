package com.advertisements.services;

import com.advertisements.entities.Advertisement;
import com.parent.CrudService;

import java.util.List;

public interface AdvertisementService extends CrudService<Advertisement, Long> {

    List<Advertisement> findAllSell();
    List<Advertisement> findAllRent();


}
