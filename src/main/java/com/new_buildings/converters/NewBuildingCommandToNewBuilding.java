package com.new_buildings.converters;

import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.entities.NewBuilding;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NewBuildingCommandToNewBuilding implements Converter<NewBuildingCommand, NewBuilding> {

    @Synchronized
    @Nullable
    @Override
    public NewBuilding convert(NewBuildingCommand source) {
        if (source == null){
            return null;
        }
        final NewBuilding newBuilding = new NewBuilding();
        newBuilding.setId(source.getId());
        newBuilding.setAddress(source.getAddress());
        newBuilding.setImage(source.getImage());
        newBuilding.setFloor(source.getFloor());
        newBuilding.setNumberOfApartment(source.getNumberOfApartment());
        newBuilding.setNumberOfRooms(source.getNumberOfRooms());
        newBuilding.setSquare(source.getSquare());
        newBuilding.setPricePerSquare(source.getPricePerSquare());
        newBuilding.setFullPrice(source.getFullPrice());
        newBuilding.setStatus(source.getStatus());

        return newBuilding;
    }
}
