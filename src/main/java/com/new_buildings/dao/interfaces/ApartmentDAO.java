package com.new_buildings.dao.interfaces;


import com.new_buildings.entities.Apartment;
import com.parent.CrudService;

public interface ApartmentDAO extends CrudService<Apartment, Long> {
    Apartment findCommandById(Long id);
    Apartment saveApartmentCommand(Apartment object);
}
