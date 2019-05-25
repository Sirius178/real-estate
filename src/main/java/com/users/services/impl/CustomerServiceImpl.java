package com.users.services.impl;

import com.new_buildings.entities.NewBuilding;
import com.users.dao.interfaces.CustomerDAO;
import com.users.entities.Customer;
import com.users.services.Postman;
import com.users.services.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Override
    public void sendEmail(Customer customer, NewBuilding newBuilding) {
        Postman postman = new Postman("sergeipopof178@Gmail.com", "Sirius178!");
        postman.send("Заявка",customer, newBuilding,"sergeipopof178@Gmail.com", "siriusonestar@yandex.ru");
    }

    @Override
    public Set<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long aLong) {
        return (Customer) customerDAO.findById(aLong);
    }

    @Override
    public Customer save(Customer object) {
        return null;
    }

    @Override
    public void delete(Customer object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
