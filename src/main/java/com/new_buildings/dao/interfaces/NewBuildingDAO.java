package com.new_buildings.dao.interfaces;


import com.parent.CrudService;
import com.new_buildings.entities.NewBuilding;

public interface NewBuildingDAO extends CrudService<NewBuilding, Long> {
    NewBuilding findCommandById(Long id);
    NewBuilding saveNewBuildingCommand (NewBuilding object);
}
