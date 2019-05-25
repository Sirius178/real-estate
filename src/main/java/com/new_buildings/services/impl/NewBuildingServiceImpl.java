package com.new_buildings.services.impl;

import com.new_buildings.entities.NewBuilding;
import com.new_buildings.services.interfaces.NewBuildingService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Component
@Service
public class NewBuildingServiceImpl implements NewBuildingService {


    @Override
    public Set<NewBuilding> findAll() {
        return null;
    }

    @Override
    public NewBuilding findById(Long aLong) {
        return null;
    }

    @Override
    public NewBuilding save(NewBuilding object) {
        return null;
    }

    @Override
    public void delete(NewBuilding object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
