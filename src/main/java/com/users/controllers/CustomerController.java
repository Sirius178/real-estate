package com.users.controllers;

import com.new_buildings.entities.Apartment;
import com.new_buildings.services.interfaces.AddressService;
import com.new_buildings.services.interfaces.ApartmentService;
import com.users.entities.Customer;
import com.users.services.interfaces.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    private CustomerService customerService;
    private ApartmentService apartmentService;
    private AddressService addressService;

    public CustomerController(CustomerService customerService,
                              ApartmentService apartmentService,
                              AddressService addressService) {
        this.customerService = customerService;
        this.apartmentService = apartmentService;
        this.addressService = addressService;
    }

    @PostMapping("/order/visit/{id}")
    public String toOrderAnApartment(@PathVariable Long id, @ModelAttribute Customer customer) {
        Apartment apartment = apartmentService.findById(id);
        customer.setApartment(apartment);
        customerService.save(customer);
        customerService.sendEmail(customer);
        return "redirect:/main";
    }


}
