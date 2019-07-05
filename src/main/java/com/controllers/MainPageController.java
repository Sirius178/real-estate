package com.controllers;

import com.advertisements.entities.Advertisement;
import com.advertisements.services.AdvertisementService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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



}
