package com.controllers;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.NewBuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminPageController {

    private NewBuildingService newBuildingService;
    private AddressService addressService;

    public AdminPageController(NewBuildingService newBuildingService, AddressService addressService) {
        this.newBuildingService = newBuildingService;
        this.addressService = addressService;
    }

    @GetMapping("/admin-page")
    public String adminPanel(){
        return "admin-pages/index";
    }

    @GetMapping("/table")
    public String tablesPage(Model model){
//        model.addAttribute("listOfNewBuilding", newBuildingService.findAll());
        return "admin-pages/tables";
    }


    @PostMapping(value = "/save-apartment")
    public String saveOrUpdate(@ModelAttribute NewBuildingCommand newBuildingCommand){
        newBuildingService.saveNewBuildingCommand(newBuildingCommand);
        return "redirect:/table";
    }

    @GetMapping("/address")
    public String addressesPage(Model model){
        return "admin-pages/address";
    }

    @PostMapping(value = "/save-address")
    public String saveOrUpdate(@ModelAttribute AddressCommand addressCommand){
        addressService.saveAddressCommand(addressCommand);
        return "redirect:/address";
    }
}
