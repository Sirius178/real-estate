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

}
