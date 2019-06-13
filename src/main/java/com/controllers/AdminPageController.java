package com.controllers;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.command.ApartmentCommand;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminPageController {

    private ApartmentService apartmentService;
    private AddressService addressService;

    public AdminPageController(ApartmentService apartmentService, AddressService addressService) {
        this.apartmentService = apartmentService;
        this.addressService = addressService;
    }

    @GetMapping("/admin-page")
    public String adminPanel(){
        return "admin-pages/index";
    }

    @GetMapping(value = "/apartments/{id}")
    public String apartmentsPage(@PathVariable("id") Long id ,Model model){

        model.addAttribute( "address", addressService.findCommandById(id));
//        model.addAttribute("listOfApartment", apartmentService.findAll());
        return "admin-pages/apartment";
    }


    @PostMapping(value = "/save-apartment")
    public String saveOrUpdate(@ModelAttribute ApartmentCommand apartmentCommand){
        System.out.println(apartmentCommand);
        apartmentService.saveApartmentCommand(apartmentCommand);

        return "redirect:/address";
    }

    @GetMapping("/address")
    public String addressesPage(Model model){
        model.addAttribute("listOfAddresses", addressService.findAll());
        return "admin-pages/address";
    }

    @PostMapping(value = "/save-address")
    public String saveOrUpdate(@ModelAttribute AddressCommand addressCommand){
        addressService.saveAddressCommand(addressCommand);
        return "redirect:/address";
    }


}
