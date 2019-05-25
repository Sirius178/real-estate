package com.users.entities;

import com.model.Person;
import com.new_buildings.entities.NewBuilding;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class Customer extends Person{

//    @Column(name = "date_time")
    private LocalDateTime dateTime;
//    @Column(name = "phone_number")
    private String phoneNumber;
//    @Column(name = "email")
    private String email;
//    @Column(name = "comment")
    private String comment;
//    @Column(name = "mortgage")
    private boolean mortgage;
//    @Column(name = "agree_to_data_processing")
    private boolean agreeToDataProcessing;
//    @ManyToOne
//    @JoinColumn(name = "new_building_id")
    private NewBuilding newBuilding;


}
