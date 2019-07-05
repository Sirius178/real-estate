package com.new_buildings.controllers;

import com.new_buildings.entities.Address;
import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import org.apache.commons.io.IOUtils;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.acl.LastOwnerException;

@Controller
public class NewBuildingController {

    private ApartmentService apartmentService;
    private AddressService addressService;


    public NewBuildingController(ApartmentService apartmentService, AddressService addressService) {
        this.apartmentService = apartmentService;
        this.addressService = addressService;
    }

    @GetMapping("/address")
    public String addressPage(Model model){
        model.addAttribute("listOfAddress",addressService.findAll());

        return "new_building_address";
    }

    @GetMapping(value = "address/{id}/apartment")
    public String apartmentPage(@PathVariable Long id, Model model){
        model.addAttribute("listOfApartment", apartmentService.findAllByID(id));

        return "new_building_apartment";
    }

    @GetMapping("/apartment/{id}/order")
    public String orderPage(@PathVariable Long id, Model model){
        model.addAttribute("apartment", apartmentService.findById(id));
        return "new_building_order";
    }

    @GetMapping("/address/{id}/address-image")
    public void renderImageFromDB(@PathVariable Long id, HttpServletResponse response) throws IOException {
        Address address = addressService.findById(id);
        ServletOutputStream outputStream =response.getOutputStream();
        try {
            response.setContentType("image/jpeg");
            byte[] image = address.getImage();

            outputStream.write(image);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            outputStream.close();
        }


    }

}
