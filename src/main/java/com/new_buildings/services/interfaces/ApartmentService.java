package com.new_buildings.services.interfaces;

import com.new_buildings.entities.Apartment;
import com.parent.CrudService;
import com.new_buildings.command.ApartmentCommand;

public interface ApartmentService extends CrudService<Apartment, Long> {


    ApartmentCommand findCommandById(Long id);
    ApartmentCommand saveApartmentCommand(ApartmentCommand object);
}
