package com.new_buildings.services.interfaces;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.entities.Address;
import com.parent.CrudService;

public interface AddressService extends CrudService<Address, Long > {

    AddressCommand findCommandById(Long id);
    AddressCommand saveAddressCommand (AddressCommand object);
}
