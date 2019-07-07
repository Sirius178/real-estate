package com.controllers;

import com.advertisements.entities.Advertisement;
import com.advertisements.services.AdvertisementService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    private AdvertisementService advertisementService;

    public MainPageController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping({"/main", "/" })
    public String main(Model model){
        model.addAttribute("listOfAdvertisement", advertisementService.findAll());

        return "main";
    }
    @GetMapping("/all-sell")
    public String findAllSell(Model model){
        model.addAttribute("listOfAdvertisementByStatusSell", advertisementService.findAllSell());
        return "main";
    }
    @GetMapping("/all-rent")
    public String findAllRent(Model model){
        model.addAttribute("listOfAdvertisementByStatusRent", advertisementService.findAllRent());
        return "main";
    }



}
