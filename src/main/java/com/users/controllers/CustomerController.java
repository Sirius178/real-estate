package com.users.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

//    @Autowired
//    CustomerService service;
//    @Qualifier("newBuildingServiceImpl")
//    @Autowired
//    ApartmentService houseService;
//
//    @RequestMapping(value = "/customer/{idHouse}", method = RequestMethod.GET)
//    public ModelAndView customerPage(@PathVariable("idHouse") int idHouse) {
//        ModelAndView modelAndView = new ModelAndView("order");
//        modelAndView.addObject("idHouse", idHouse);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/customerRequest/{idHouse}", method = RequestMethod.POST)
//    public ModelAndView customerRequest(@PathVariable("idHouse") int idHouse,
//                                        @RequestParam(value = "name") String name,
//                                        @RequestParam(value = "phoneNumber") String phoneNumber,
//                                        @RequestParam(value = "email") String email,
//                                        @RequestParam(value = "comment") String comment,
//                                        @RequestParam(value = "mortgage") boolean mortgage,
//                                        @RequestParam(value = "agreeToDataProcessing") boolean agreeToDataProcessing,
//                                        Customer customer) {
//        ModelAndView modelAndView = new ModelAndView("order");
//
//        Apartment apartment = houseService.getHouseByID(idHouse);
//
//        try {
//            customer.setName(name);
//            customer.setPhoneNumber(phoneNumber);
//            customer.setEmail(email);
//            customer.setComment(comment);
//            customer.setMortgage(mortgage);
//            customer.setAgreeToDataProcessing(agreeToDataProcessing);
//            customer.setIdHouse(idHouse);
//            service.saveCustomerRequest(customer);
//            service.sendEmail(customer, apartment);
//
//            modelAndView.addObject("messageForCustomerOk",customer.getName());
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//
//        return modelAndView;
//    }
}
