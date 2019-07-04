package com.new_buildings.services.interfaces;

import com.new_buildings.entities.Apartment;
import com.parent.CrudService;


import java.util.List;

public interface ApartmentService extends CrudService<Apartment, Long> {


    List<Apartment> findAllByID(long id);
}
