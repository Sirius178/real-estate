package com.new_buildings.controllers;

import com.new_buildings.services.interfaces.NewBuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewBuildingController {

    private NewBuildingService newBuildingService;

    public NewBuildingController(NewBuildingService newBuildingService) {
        this.newBuildingService = newBuildingService;
    }

    @GetMapping("/new_building")
    public String newBuildingPage(){
        return "new_building";
    }



//    @Qualifier("newBuildingServiceImpl")
//    @Autowired
//    private NewBuildingService service;
//
//    @RequestMapping(value = "/newBuildingAdmin", method = RequestMethod.GET)
//    public ModelAndView newBuildingAdmin(){
//        ModelAndView modelAndView = new ModelAndView("admin-pages/index");
//        modelAndView.addObject("listOfHouseInNewComplex", service.listOfHouseInNewComplex());
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage(){
//        ModelAndView modelAndView = new ModelAndView("addHouse");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/newBuilding", method = RequestMethod.GET)
//    public ModelAndView newBuildingPage(){
//        ModelAndView modelAndView = new ModelAndView("newBuilding");
//        modelAndView.addObject("listOfHouseInNewComplex", service.listOfHouseInNewComplex());
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/addHouseInNewComplex" , method = RequestMethod.POST)
//    public ModelAndView houseAdd(@RequestParam(value = "nameOfComplex") String nameOfComplex,
//                                 @RequestParam(value = "nameOfHouse") String nameOfHouse,
//                                 @RequestParam(value = "floor") int floor,
//                                 @RequestParam(value =  "numberOfApartment") int numberOfApartment,
//                                 @RequestParam(value =  "numberOfRoom") int numberOfRoom,
//                                 @RequestParam(value = "square") double square,
//                                 @RequestParam(value = "pricePerSquare") int pricePerSquare,
//                                 @RequestParam(value = "fullPrice") int fullPrice,
//                                 @RequestParam(value = "status") Status status,
//                                 NewBuilding newBuilding) throws Exception{
//        ModelAndView modelAndView = new ModelAndView("redirect:/newBuilding");
//        try {
//            newBuilding.setNameOfComplex(nameOfComplex);
//            newBuilding.setNameOfHouse(nameOfHouse);
//            newBuilding.setFloor(floor);
//            newBuilding.setNumberOfApartment(numberOfApartment);
//            newBuilding.setNumberOfRoom(numberOfRoom);
//            newBuilding.setSquare(square);
//            newBuilding.setPricePerSquare(pricePerSquare);
//            newBuilding.setFullPrice(fullPrice);
//            newBuilding.setStatus(status);
//            service.addHouse(newBuilding);
//            modelAndView.addObject("addMessage","House added " + newBuilding.getNameOfComplex());
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }finally {
//            return modelAndView;
//        }
//
//    }
//
//    @RequestMapping(value = "/removeHouseFromNewComplex/{idHouse}", method = RequestMethod.GET)
//    public String removeHouseFromNewComplex(@PathVariable("idHouse") int idHouse, NewBuilding newBuilding){
//        newBuilding.setIdHouse(idHouse);
//        service.deleteHouseByID(newBuilding);
//        return "redirect:/";
//    }
//    @RequestMapping(value = "/edit/{idHouse}", method = RequestMethod.GET)
//    public ModelAndView edit(@PathVariable("idHouse") int idHouse) {
//        ModelAndView modelAndView = new ModelAndView("editHouse");
//        NewBuilding newBuilding = service.getHouseByID(idHouse);
//        modelAndView.addObject("houseInNewComplex", newBuilding);
//        return modelAndView;
//    }
//    @RequestMapping(value = "/updateHouseInNewComplex/{idHouse}", method = RequestMethod.POST)
//    public ModelAndView updateHouseInNewComplex(@PathVariable("idHouse") int idHouse,
//                                                @RequestParam(value = "nameOfComplex") String nameOfComplex,
//                                                @RequestParam(value = "nameOfHouse") String nameOfHouse,
//                                                @RequestParam(value = "floor") int floor,
//                                                @RequestParam(value =  "numberOfApartment") int numberOfApartment,
//                                                @RequestParam(value =  "numberOfRoom") int numberOfRoom,
//                                                @RequestParam(value = "square") double square,
//                                                @RequestParam(value = "pricePerSquare") int pricePerSquare,
//                                                @RequestParam(value = "fullPrice") int fullPrice,
//                                                @RequestParam(value = "status") Status status,
//                                                NewBuilding newBuilding){
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//        try{
//            newBuilding.setNameOfComplex(nameOfComplex);
//            newBuilding.setNameOfHouse(nameOfHouse);
//            newBuilding.setFloor(floor);
//            newBuilding.setNumberOfApartment(numberOfApartment);
//            newBuilding.setNumberOfRoom(numberOfRoom);
//            newBuilding.setSquare(square);
//            newBuilding.setPricePerSquare(pricePerSquare);
//            newBuilding.setFullPrice(fullPrice);
//            newBuilding.setStatus(status);
//            newBuilding.setIdHouse(idHouse);
//            service.updateHouseByID(newBuilding);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return modelAndView;
//    }

}
