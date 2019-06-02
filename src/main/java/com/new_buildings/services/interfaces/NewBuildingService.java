package com.new_buildings.services.interfaces;

import com.parent.CrudService;
import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.entities.NewBuilding;

public interface NewBuildingService extends CrudService<NewBuilding, Long> {


    NewBuildingCommand findCommandById(Long id);
    NewBuildingCommand saveNewBuildingCommand (NewBuildingCommand object);
}
