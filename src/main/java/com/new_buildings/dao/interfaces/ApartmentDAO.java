package com.new_buildings.dao.interfaces;


import com.new_buildings.entities.Apartment;
import com.parent.CrudService;

import java.util.List;

public interface ApartmentDAO extends CrudService<Apartment, Long> {

    List<Apartment> findAllByID(long id);
}
