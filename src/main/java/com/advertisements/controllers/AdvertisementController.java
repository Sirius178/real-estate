package com.advertisements.controllers;

import com.advertisements.entities.enums.*;
import com.advertisements.services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AdvertisementController {

//    @Autowired
//    AdvertisementService service;
//
//    @RequestMapping(value = "/addPosterView", method = RequestMethod.GET)
//
//    ModelAndView addPosterView() {
//        ModelAndView modelAndView = new ModelAndView("addPoster");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/addPoster", method = RequestMethod.POST)
//    ModelAndView addPoster(@RequestParam(value = "accountType") AccountType accountType,
//                           @RequestParam(value = "dealType") DealType dealType,
//                           @RequestParam(value = "rentType") RentType rentType,
//                           @RequestParam(value = "realEstateType") RealEstateType realEstateType,
//                           @RequestParam(value = "living") Living living,
//                           @RequestParam(value = "commercial") Commercial commercial,
//                           @RequestParam(value = "district") District district,
//                           @RequestParam(value = "address") String address,
//                           @RequestParam(value = "buildingType") BuildingType buildingType,
//                           @RequestParam(value = "description") String description,
//                           @RequestParam(value = "photo") byte[] photo,
//                           @RequestParam(value = "price") int price,
//                           @RequestParam(value = "deposit") int deposit,
//                           @RequestParam(value = "communalPayments") boolean communalPayments,
//                           @RequestParam(value = "cadastrNumber") String cadastrNumber,
//                           @RequestParam(value = "numberOfRooms") NumberOfRooms numberOfRooms,
//                           @RequestParam(value = "square") double square,
//                           @RequestParam(value = "squareOfLiving") double squareOfLiving,
//                           @RequestParam(value = "squareOfKitchen") double squareOfKitchen,
//                           @RequestParam(value = "floor") int floor,
//                           @RequestParam(value = "repairs") Repairs repairs,
//                           @RequestParam(value = "animal") boolean animal,
//                           @RequestParam(value = "furniture") boolean furniture,
//                           @RequestParam(value = "furnitureInTheKitchen") boolean furnitureInTheKitchen,
//                           @RequestParam(value = "windowInside") boolean windowInside,
//                           @RequestParam(value = "windowOutside") boolean windowOutside,
//                           @RequestParam(value = "balcony") boolean balcony,
//                           @RequestParam(value = "loggia") boolean loggia,
//                           @RequestParam(value = "fridge") boolean fridge,
//                           @RequestParam(value = "dishwasher") boolean dishwasher,
//                           @RequestParam(value = "washer") boolean washer,
//                           @RequestParam(value = "tv") boolean tv,
//                           @RequestParam(value = "phone") boolean phone,
//                           @RequestParam(value = "bath") boolean bath,
//                           @RequestParam(value = "shower") boolean shower,
//                           @RequestParam(value = "conditioner") boolean conditioner,
//                           @RequestParam(value = "internet") boolean internet,
//                           @RequestParam(value = "separateBathroom") boolean separateBathroom,
//                           @RequestParam(value = "combinedBathroom") boolean combinedBathroom,
//                           @RequestParam(value = "lift") boolean lift,
//                           @RequestParam(value = "nameOfComplex") String nameOfComplex,
//                           @RequestParam(value = "yearOfConstruction") int yearOfConstruction,
//                           @RequestParam(value = "ramp") boolean ramp,
//                           @RequestParam(value = "title") String title,
//                           Poster poster) {
//        ModelAndView modelAndView = new ModelAndView("addPoster");
//        try{
//
//            poster.setAccountType(accountType);
//            poster.setDealType(dealType);
//            poster.setRentType(rentType);
//            poster.setRealEstateType(realEstateType);
//            poster.setLiving(living);
//            poster.setCommercial(commercial);
//            poster.setDistrict(district);
//            poster.setAddress(address);
//            poster.setBuildingType(buildingType);
//            poster.setDescription(description);
//            poster.setPhoto(photo);
//            poster.setPrice(price);
//            poster.setDeposit(deposit);
//            poster.setCommunalPayments(communalPayments);
//            poster.setCadastrNumber(cadastrNumber);
//            poster.setNumberOfRooms(numberOfRooms);
//            poster.setSquare(square);
//            poster.setSquareOfLiving(squareOfLiving);
//            poster.setSquareOfKitchen(squareOfKitchen);
//            poster.setFloor(floor);
//            poster.setRepairs(repairs);
//            poster.setAnimal(animal);
//            poster.setFurniture(furniture);
//            poster.setFurnitureInTheKitchen(furnitureInTheKitchen);
//            poster.setWindowInside(windowInside);
//            poster.setWindowOutside(windowOutside);
//            poster.setBalcony(balcony);
//            poster.setLoggia(loggia);
//            poster.setFridge(fridge);
//            poster.setDishwasher(dishwasher);
//            poster.setWasher(washer);
//            poster.setTv(tv);
//            poster.setPhone(phone);
//            poster.setBath(bath);
//            poster.setShower(shower);
//            poster.setConditioner(conditioner);
//            poster.setInternet(internet);
//            poster.setSeparateBathroom(separateBathroom);
//            poster.setCombinedBathroom(combinedBathroom);
//            poster.setLift(lift);
//            poster.setNameOfComplex(nameOfComplex);
//            poster.setYearOfConstruction(yearOfConstruction);
//            poster.setRamp(ramp);
//            poster.setTitle(title);
//
//            service.addPoster(poster);
//
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }finally {
//            return modelAndView;
//        }
//
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView listOfPoster(){
//        ModelAndView modelAndView = new ModelAndView("main");
//        modelAndView.addObject("listOfPoster", service.listOfPoster());
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/posterImage" , method = RequestMethod.GET)
//    public void productImage(HttpServletRequest request, HttpServletResponse response, Model model,
//                             @RequestParam("idPoster") int idPoster) throws IOException {
//        Poster poster = service.getPosterByID(idPoster);
//
//        if (poster != null && poster.getPhoto() != null) {
//            response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
//            response.getOutputStream().write(poster.getPhoto());
//            System.out.write(poster.getPhoto());
//        }
//        response.getOutputStream().close();
//    }
//
//    @RequestMapping(value = "/poster/{idPoster}", method = RequestMethod.GET)
//    public ModelAndView showPoster(@PathVariable("idPoster") int idPoster){
//        ModelAndView modelAndView = new ModelAndView("poster");
//        Poster poster = service.getPosterByID(idPoster);
//        modelAndView.addObject("poster", poster);
//        return modelAndView;
//    }

}
