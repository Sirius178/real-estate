package com.controllers;

import com.new_buildings.command.NewBuildingCommand;
import com.new_buildings.entities.Address;
import com.new_buildings.entities.NewBuilding;
import com.new_buildings.entities.Status;
import com.new_buildings.services.interfaces.NewBuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminPageController {

    private NewBuildingService newBuildingService;

    public AdminPageController(NewBuildingService newBuildingService) {
        this.newBuildingService = newBuildingService;
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


    @PostMapping(value = "/save")
    public String saveOrUpdate(@ModelAttribute NewBuildingCommand newBuildingCommand){
        newBuildingService.saveNewBuildingCommand(newBuildingCommand);
        return "redirect:/admin-pages/tables";
    }
}
