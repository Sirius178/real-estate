package com.new_buildings.controllers;

import com.new_buildings.services.interfaces.ApartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewBuildingController {

    private ApartmentService apartmentService;

    public NewBuildingController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping("/new_building")
    public String newBuildingPage(){
        return "new_building";
    }



//    @Qualifier("newBuildingServiceImpl")
//    @Autowired
//    private ApartmentService service;
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
//    @RequestMapping(value = "/apartment", method = RequestMethod.GET)
//    public ModelAndView newBuildingPage(){
//        ModelAndView modelAndView = new ModelAndView("apartment");
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
//                                 Apartment apartment) throws Exception{
//        ModelAndView modelAndView = new ModelAndView("redirect:/apartment");
//        try {
//            apartment.setNameOfComplex(nameOfComplex);
//            apartment.setNameOfHouse(nameOfHouse);
//            apartment.setFloor(floor);
//            apartment.setNumberOfApartment(numberOfApartment);
//            apartment.setNumberOfRoom(numberOfRoom);
//            apartment.setSquare(square);
//            apartment.setPricePerSquare(pricePerSquare);
//            apartment.setFullPrice(fullPrice);
//            apartment.setStatus(status);
//            service.addHouse(apartment);
//            modelAndView.addObject("addMessage","House added " + apartment.getNameOfComplex());
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }finally {
//            return modelAndView;
//        }
//
//    }
//
//    @RequestMapping(value = "/removeHouseFromNewComplex/{idHouse}", method = RequestMethod.GET)
//    public String removeHouseFromNewComplex(@PathVariable("idHouse") int idHouse, Apartment apartment){
//        apartment.setIdHouse(idHouse);
//        service.deleteHouseByID(apartment);
//        return "redirect:/";
//    }
//    @RequestMapping(value = "/edit/{idHouse}", method = RequestMethod.GET)
//    public ModelAndView edit(@PathVariable("idHouse") int idHouse) {
//        ModelAndView modelAndView = new ModelAndView("editHouse");
//        Apartment apartment = service.getHouseByID(idHouse);
//        modelAndView.addObject("houseInNewComplex", apartment);
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
//                                                Apartment apartment){
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//        try{
//            apartment.setNameOfComplex(nameOfComplex);
//            apartment.setNameOfHouse(nameOfHouse);
//            apartment.setFloor(floor);
//            apartment.setNumberOfApartment(numberOfApartment);
//            apartment.setNumberOfRoom(numberOfRoom);
//            apartment.setSquare(square);
//            apartment.setPricePerSquare(pricePerSquare);
//            apartment.setFullPrice(fullPrice);
//            apartment.setStatus(status);
//            apartment.setIdHouse(idHouse);
//            service.updateHouseByID(apartment);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return modelAndView;
//    }

}
