package com.new_buildings.converters;

import com.new_buildings.command.ApartmentCommand;
import com.new_buildings.entities.Apartment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ApartmentCommandToApartment implements Converter<ApartmentCommand, Apartment> {

    @Synchronized
    @Nullable
    @Override
    public Apartment convert(ApartmentCommand source) {
        if (source == null){
            return null;
        }
        final Apartment apartment = new Apartment();
        apartment.setId(source.getId());
        apartment.setAddress(source.getAddress());
        apartment.setImage(source.getImage());
        apartment.setFloor(source.getFloor());
        apartment.setNumberOfApartment(source.getNumberOfApartment());
        apartment.setNumberOfRooms(source.getNumberOfRooms());
        apartment.setSquare(source.getSquare());
        apartment.setPricePerSquare(source.getPricePerSquare());
        apartment.setFullPrice(source.getFullPrice());
        apartment.setStatus(source.getStatus());

        return apartment;
    }
}
