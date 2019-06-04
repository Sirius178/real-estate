package com.users.services.interfaces;

import com.new_buildings.entities.Apartment;
import com.parent.CrudService;
import com.users.entities.Customer;

public interface CustomerService extends CrudService<Customer, Long> {

    void sendEmail(Customer customer, Apartment apartment);

}
