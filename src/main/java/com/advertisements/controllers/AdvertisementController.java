package com.advertisements.controllers;

import com.advertisements.entities.Advertisement;
import com.advertisements.entities.enums.*;
import com.advertisements.services.AdvertisementService;
import com.new_buildings.entities.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class AdvertisementController {


    private AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/add-advertisement")
    public String addAdvertisementPage() {
        return "add_advertisement";
    }

    @PostMapping(value = "/save-advertisement")
    public String saveOrUpdateAdvertisement(
//            @RequestParam(value = "accountType") AccountType accountType,
//                                            @RequestParam(value = "dealType") DealType dealType,
//                                            @RequestParam(value = "rentType") RentType rentType,
//                                            @RequestParam(value = "realEstateType") RealEstateType realEstateType,
//                                            @RequestParam(value = "living") Living living,
//                                            @RequestParam(value = "commercial") Commercial commercial,
//                                            @RequestParam(value = "district") District district,
//                                            @RequestParam(value = "address") String address,
//                                            @RequestParam(value = "buildingType") BuildingType buildingType,
//                                            @RequestParam(value = "description") String description,
                                            @RequestParam(value = "photo") MultipartFile multipartFile,
//                                            @RequestParam(value = "price") int price,
//                                            @RequestParam(value = "deposit") int deposit,
//                                            @RequestParam(value = "communalPayments") boolean communalPayments,
//                                            @RequestParam(value = "numberOfRooms") NumberOfRooms numberOfRooms,
//                                            @RequestParam(value = "square") double square,
//                                            @RequestParam(value = "squareOfLiving") double squareOfLiving,
//                                            @RequestParam(value = "squareOfKitchen") double squareOfKitchen,
//                                            @RequestParam(value = "floor") int floor,
//                                            @RequestParam(value = "repairs") Repairs repairs,
//                                            @RequestParam(value = "animal") boolean animal,
//                                            @RequestParam(value = "furniture") boolean furniture,
//                                            @RequestParam(value = "windowInside") boolean windowInside,
//                                            @RequestParam(value = "windowOutside") boolean windowOutside,
//                                            @RequestParam(value = "balcony") boolean balcony,
//                                            @RequestParam(value = "loggia") boolean loggia,
//                                            @RequestParam(value = "tv") boolean tv,
//                                            @RequestParam(value = "phone") boolean phone,
//                                            @RequestParam(value = "bath") boolean bath,
//                                            @RequestParam(value = "shower") boolean shower,
//                                            @RequestParam(value = "conditioner") boolean conditioner,
//                                            @RequestParam(value = "internet") boolean internet,
//                                            @RequestParam(value = "separateBathroom") boolean separateBathroom,
//                                            @RequestParam(value = "combinedBathroom") boolean combinedBathroom,
//                                            @RequestParam(value = "lift") boolean lift,
//                                            @RequestParam(value = "nameOfComplex") String nameOfComplex,
//                                            @RequestParam(value = "yearOfConstruction") int yearOfConstruction,
//                                            @RequestParam(value = "ramp") boolean ramp,
                                            @RequestParam(value = "title") String title) {
     saveImageFile(title,multipartFile);
        return "redirect:/";
    }

    @GetMapping("/advertisement/{id}")
    public String advertisementPage(@PathVariable("id")  Long id, Model model){
        Advertisement advertisement = advertisementService.findById(id);
        model.addAttribute("advertisement", advertisement );
        return "advertisement";
    }

    @GetMapping("/advertisement/{id}/advertisement-image")
    public void showImageFromDB(@PathVariable("id")  Long id, HttpServletResponse response) throws IOException {
        Advertisement advertisement = advertisementService.findById(id);
        ServletOutputStream outputStream =response.getOutputStream();
        try {
            response.setContentType("image/jpeg");
            byte[] image = advertisement.getPhoto();
            outputStream.write(image);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            outputStream.close();
        }


    }


    void saveImageFile(String title, MultipartFile multipartFile) {
        Advertisement object = new Advertisement();
        try {

            byte[] byteObjects = new byte[multipartFile.getBytes().length];
            int i = 0;
            for (byte b : multipartFile.getBytes()) {
                byteObjects[i++] = b;
            }

            object.setTitle(title);
            object.setPhoto(byteObjects);
            advertisementService.save(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
