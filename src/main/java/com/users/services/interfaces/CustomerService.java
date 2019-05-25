package com.users.services.interfaces;

import com.model.CrudService;
import com.new_buildings.entities.NewBuilding;
import com.users.entities.Customer;

public interface CustomerService extends CrudService<Customer, Long> {

    void sendEmail(Customer customer, NewBuilding newBuilding);

}
