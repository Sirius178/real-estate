package com.new_buildings.services.impl;

import com.new_buildings.command.ApartmentCommand;
import com.new_buildings.converters.ApartmentCommandToApartment;
import com.new_buildings.converters.ApartmentToApartmentCommand;
import com.new_buildings.dao.interfaces.ApartmentDAO;
import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.ApartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Component
@Service
public class ApartmentServiceImpl implements ApartmentService {

    private final ApartmentDAO apartmentDAO;
    private final ApartmentCommandToApartment apartmentCommandToApartment;
    private final ApartmentToApartmentCommand apartmentToApartmentCommand;

    public ApartmentServiceImpl(ApartmentDAO apartmentDAO,
                                ApartmentCommandToApartment apartmentCommandToApartment,
                                ApartmentToApartmentCommand apartmentToApartmentCommand) {
        this.apartmentDAO = apartmentDAO;
        this.apartmentCommandToApartment = apartmentCommandToApartment;
        this.apartmentToApartmentCommand = apartmentToApartmentCommand;
    }


    @Override
    public List<Apartment> findAll() {
        return apartmentDAO.findAll();
    }

    @Override
    public Apartment findById(Long aLong) {
        return apartmentDAO.findById(aLong);
    }


    public ApartmentCommand save() {
        return null;
    }

    @Override
    public Apartment save(Apartment apartment) {
        return null;
    }

    @Override
    public void delete(Apartment object) {
        apartmentDAO.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        apartmentDAO.deleteById(aLong);
    }

    @Override
    public ApartmentCommand findCommandById(Long id) {
        return null;
    }

    @Override
    public ApartmentCommand saveNewBuildingCommand(ApartmentCommand object) {
        Apartment detachedApartment = apartmentCommandToApartment.convert(object);
        Apartment savedApartment = apartmentDAO.saveApartmentCommand(detachedApartment);
        log.debug("Saved id: " + savedApartment.getId());
        return apartmentToApartmentCommand.convert(savedApartment);
    }
}
