package com.new_buildings.services.impl;

import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.converters.NewBuildingCommandToNewBuilding;
import com.new_buildings.converters.NewBuildingToNewBuildingCommand;
import com.new_buildings.dao.interfaces.NewBuildingDAO;
import com.new_buildings.entities.NewBuilding;
import com.new_buildings.services.interfaces.NewBuildingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
@Slf4j
@Component
@Service
public class NewBuildingServiceImpl implements NewBuildingService {

    private final NewBuildingDAO newBuildingDAO;
    private final NewBuildingCommandToNewBuilding newBuildingCommandToNewBuilding;
    private final NewBuildingToNewBuildingCommand newBuildingToNewBuildingCommand;

    public NewBuildingServiceImpl(NewBuildingDAO newBuildingDAO,
                                  NewBuildingCommandToNewBuilding newBuildingCommandToNewBuilding,
                                  NewBuildingToNewBuildingCommand newBuildingToNewBuildingCommand) {
        this.newBuildingDAO = newBuildingDAO;
        this.newBuildingCommandToNewBuilding = newBuildingCommandToNewBuilding;
        this.newBuildingToNewBuildingCommand = newBuildingToNewBuildingCommand;
    }


    @Override
    public Set<NewBuilding> findAll() {
        return newBuildingDAO.findAll();
    }

    @Override
    public NewBuilding findById(Long aLong) {
        return newBuildingDAO.findById(aLong);
    }


    public NewBuildingCommand save() {
        return null;
    }

    @Override
    public NewBuilding save(NewBuilding newBuilding) {
        return null;
    }

    @Override
    public void delete(NewBuilding object) {
        newBuildingDAO.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        newBuildingDAO.deleteById(aLong);
    }

    @Override
    public NewBuildingCommand findCommandById(Long id) {
        return null;
    }

    @Override
    public NewBuildingCommand saveNewBuildingCommand (NewBuildingCommand object) {
        NewBuilding detachedNewBuilding = newBuildingCommandToNewBuilding.convert(object);
        NewBuilding savedNewBuilding = newBuildingDAO.saveNewBuildingCommand(detachedNewBuilding);
        log.debug("Saved id: " + savedNewBuilding.getId());
        return newBuildingToNewBuildingCommand.convert(savedNewBuilding);
    }
}
