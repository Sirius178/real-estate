package com.new_buildings.services.impl;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.converters.AddressCommandToAddress;
import com.new_buildings.converters.AddressToAddressCommand;
import com.new_buildings.dao.interfaces.AddressDAO;
import com.new_buildings.entities.Address;
import com.new_buildings.services.interfaces.AddressService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressDAO addressDAO;
    private final AddressCommandToAddress addressCommandToAddress;
    private final AddressToAddressCommand addressToAddressCommand;

    public AddressServiceImpl(AddressDAO addressDAO, AddressCommandToAddress addressCommandToAddress, AddressToAddressCommand addressToAddressCommand) {
        this.addressDAO = addressDAO;
        this.addressCommandToAddress = addressCommandToAddress;
        this.addressToAddressCommand = addressToAddressCommand;
    }


    @Override
    public AddressCommand findCommandById(Long id) {
        return null;
    }

    @Override
    public AddressCommand saveAddressCommand(AddressCommand object) {
        Address detachedAddress = addressCommandToAddress.convert(object);
        Address savedAddress = addressDAO.saveAddressCommand(detachedAddress);
        return addressToAddressCommand.convert(savedAddress);
    }

    @Override
    public Set<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Long aLong) {
        return null;
    }

    @Override
    public Address save(Address object) {
        return null;
    }

    @Override
    public void delete(Address object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
