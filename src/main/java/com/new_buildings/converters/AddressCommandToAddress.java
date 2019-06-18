package com.new_buildings.converters;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.entities.Address;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AddressCommandToAddress implements Converter<AddressCommand, Address> {

    ApartmentCommandToApartment apartmentCommandToApartment;
    ApartmentToApartmentCommand apartmentToApartmentCommand;

    @Synchronized
    @Nullable
    @Override
    public Address convert(AddressCommand source) {

        if (source == null) {
            return null;
        }
        Address address = new Address();
        address.setId(source.getId());
        address.setAddress(source.getAddress());
        address.setImage(source.getImage());

        return address;
    }
}
