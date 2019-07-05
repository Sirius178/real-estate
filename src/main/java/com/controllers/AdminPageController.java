package com.controllers;


import com.new_buildings.entities.Address;
import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;


@Controller
@RequestMapping(value = "/admin")
public class AdminPageController {

    private ApartmentService apartmentService;
    private AddressService addressService;


    public AdminPageController(ApartmentService apartmentService, AddressService addressService) {
        this.apartmentService = apartmentService;
        this.addressService = addressService;
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

    public  String saveOrUpdate
    @GetMapping("/address")
    public String addressesPage(Model model) {
        model.addAttribute("listOfAddresses", addressService.findAll());
        return "admin-pages/address";
    }

    @PostMapping(value = "/save-address")
    public String saveOrUpdateAddress(@RequestParam(value = "address") String address,
                               @RequestParam(value = "image") MultipartFile multipartFile) {
        saveImageFile(address, multipartFile);
        return "redirect:/admin/address";
    }

    void saveImageFile(String address, MultipartFile multipartFile) {
        Address object = new Address();
        try {

            byte[] byteObjects = new byte[multipartFile.getBytes().length];
            int i = 0;
            for (byte b : multipartFile.getBytes()) {
                byteObjects[i++] = b;
            }
            object.setAddress(address);
            object.setImage(byteObjects);
            addressService.save(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
