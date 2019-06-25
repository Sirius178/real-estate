package com.controllers;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.converters.AddressCommandToAddress;
import com.new_buildings.entities.Address;
import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String adminPanel(){
        return "admin-pages/index";
    }

    @GetMapping(value = "/apartments/{id}")
    public String apartmentsPage(@PathVariable("id") Long id ,Model model){

        model.addAttribute( "address", addressService.findById(id));
//        model.addAttribute("listOfApartment", apartmentService.findAll());
        return "admin-pages/apartment";
    }

    @PostMapping(value = "/save-apartment/{id}")
    public String saveOrUpdate(@PathVariable("id") Long id, @ModelAttribute Apartment apartment){
        AddressCommand addressCommand = addressService.findCommandById(id);
        Address address = addressCommandToAddress.convert(addressCommand);
        apartment.setAddress(address);
        apartmentService.save(apartment);
        return "redirect:/admin/address";
    }

    @GetMapping("/address")
    public String addressesPage(Model model){
        model.addAttribute("listOfAddresses", addressService.findAll());
        return "admin-pages/address";
    }

    @PostMapping(value = "/save-address")
    public String saveOrUpdate(@ModelAttribute AddressCommand addressCommand){
<<<<<<< Updated upstream
=======
//        try{
//            if (multipartFile == null){
//                return null;
//            }
//            Byte[] byteObjects = new Byte[multipartFile.getBytes().length];
//            int i = 0;
//            for (byte b: multipartFile.getBytes()){
//                byteObjects[i++] = b;
//            }
//            System.out.println(byteObjects.length);
//            addressCommand.setImage(byteObjects);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        addressCommand.setAddress(address);
>>>>>>> Stashed changes
        addressService.saveAddressCommand(addressCommand);
        return "redirect:/address";
    }


}
