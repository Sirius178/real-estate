package com.new_buildings.converters;

import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.entities.NewBuilding;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NewBuildingToNewBuildingCommand implements Converter<NewBuilding, NewBuildingCommand>{

    @Synchronized
    @Nullable
    @Override
    public NewBuildingCommand convert(NewBuilding source) {
        if (source == null){
            return null;
        }

        final NewBuildingCommand newBuildingCommand = new NewBuildingCommand();

        newBuildingCommand.setId(source.getId());
        newBuildingCommand.setAddress(source.getAddress());
        newBuildingCommand.setImage(source.getImage());
        newBuildingCommand.setFloor(source.getFloor());
        newBuildingCommand.setNumberOfApartment(source.getNumberOfApartment());
        newBuildingCommand.setNumberOfRooms(source.getNumberOfRooms());
        newBuildingCommand.setSquare(source.getSquare());
        newBuildingCommand.setPricePerSquare(source.getPricePerSquare());
        newBuildingCommand.setFullPrice(source.getFullPrice());
        newBuildingCommand.setStatus(source.getStatus());

        return newBuildingCommand;
    }
}
