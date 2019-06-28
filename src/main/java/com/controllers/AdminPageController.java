package com.controllers;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.converters.AddressCommandToAddress;
import com.new_buildings.entities.Address;
import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping(value = "/admin")
public class AdminPageController {

    private ApartmentService apartmentService;
    private AddressService addressService;
    private AddressCommandToAddress addressCommandToAddress;

    public AdminPageController(ApartmentService apartmentService, AddressService addressService, AddressCommandToAddress addressCommandToAddress) {
        this.apartmentService = apartmentService;
        this.addressService = addressService;
        this.addressCommandToAddress = addressCommandToAddress;
    }

    @GetMapping("/admin-page")
    public String adminPanel() {
        return "admin-pages/index";
    }

    @GetMapping(value = "/apartments/{id}")
    public String apartmentsPage(@PathVariable("id") Long id, Model model) {

        model.addAttribute("address", addressService.findById(id));
//        model.addAttribute("listOfApartment", apartmentService.findAll());
        return "admin-pages/apartment";
    }

    @PostMapping(value = "/save-apartment/{id}", consumes = {MediaType.ALL_VALUE})
    public String saveOrUpdate(@PathVariable("id") Long id, @ModelAttribute Apartment apartment) {
        AddressCommand addressCommand = addressService.findCommandById(id);
        Address address = addressCommandToAddress.convert(addressCommand);
        apartment.setAddress(address);
        apartmentService.save(apartment);
        return "redirect:/admin/address";
    }

    @GetMapping("/address")
    public String addressesPage(Model model) {
        model.addAttribute("listOfAddresses", addressService.findAll());
        return "admin-pages/address";
    }

    @RequestMapping(value = "/save-address", consumes = {MediaType.ALL_VALUE} , method = RequestMethod.POST)
    public String saveOrUpdate( @RequestParam( value = "address") String address, @RequestParam( value = "imagefile") MultipartFile file , AddressCommand addressCommand) {
        if (file == null) {
            return null;
        } else {
            try {
                Byte[] byteObjects = new Byte[file.getBytes().length];
                int i = 0;
                for (byte b : byteObjects) {
                    byteObjects[i++] = b;
                }
                addressCommand.setImage(byteObjects);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        addressCommand.setAddress(address);
        addressService.saveAddressCommand(addressCommand);
        return "redirect:/address";
    }


}
