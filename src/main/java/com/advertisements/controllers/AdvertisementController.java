package com.advertisements.controllers;

import com.advertisements.entities.Advertisement;
import com.advertisements.services.AdvertisementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdvertisementController {


    private  AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/add-advertisement")
    public String addAdvertisementPage() {
        return "add_advertisement";
    }

    @PostMapping(value = "/save-advertisement")
    public String saveOrUpdate(@ModelAttribute Advertisement advertisement){
        advertisementService.save(advertisement);
        return "redirect:/main";
    }

//    @RequestMapping(value = "/poster/{idPoster}", method = RequestMethod.GET)
//    public ModelAndView showPoster(@PathVariable("idPoster") int idPoster){
//        ModelAndView modelAndView = new ModelAndView("poster");
//        Poster poster = service.getPosterByID(idPoster);
//        modelAndView.addObject("poster", poster);
//        return modelAndView;
//    }

}
