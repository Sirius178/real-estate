package com.users.entities;

import com.parent.Person;
import com.new_buildings.entities.Apartment;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Customer extends Person{
    //todo username ,create customer command;
    private LocalDateTime dateTime;

    private String phoneNumber;

    private String email;

    private String comment;

    private boolean mortgage;

    private boolean agreeToDataProcessing;

    private Apartment apartment;


    public Customer(String phoneNumber, String email, String comment, boolean mortgage, boolean agreeToDataProcessing, Apartment apartment) {

        dateTime = LocalDateTime.now();
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.comment = comment;
        this.mortgage = mortgage;
        this.agreeToDataProcessing = agreeToDataProcessing;
        this.apartment = apartment;
    }

    public Customer() {
    }


}
