package com.new_buildings.converters;

import com.new_buildings.command.ApartmentCommand;
import com.new_buildings.entities.Apartment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ApartmentToApartmentCommand implements Converter<Apartment, ApartmentCommand>{

    private final AddressToAddressCommand addressToAddressCommand;

    public ApartmentToApartmentCommand(AddressToAddressCommand addressToAddressCommand) {
        this.addressToAddressCommand = addressToAddressCommand;
    }

    @Synchronized
    @Nullable
    @Override
    public ApartmentCommand convert(Apartment source) {
        if (source == null){
            return null;
        }

        final ApartmentCommand apartmentCommand = new ApartmentCommand();

        apartmentCommand.setId(source.getId());
        apartmentCommand.setAddress(addressToAddressCommand.convert(source.getAddress()));
        apartmentCommand.setImage(source.getImage());
        apartmentCommand.setFloor(source.getFloor());
        apartmentCommand.setNumberOfApartment(source.getNumberOfApartment());
        apartmentCommand.setNumberOfRooms(source.getNumberOfRooms());
        apartmentCommand.setSquare(source.getSquare());
        apartmentCommand.setPricePerSquare(source.getPricePerSquare());
        apartmentCommand.setFullPrice(source.getFullPrice());
        apartmentCommand.setStatus(source.getStatus());

        return apartmentCommand;
    }
}
