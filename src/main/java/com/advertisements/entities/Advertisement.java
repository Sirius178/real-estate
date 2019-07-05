package com.advertisements.entities;


import com.advertisements.entities.enums.*;
import com.parent.BaseEntity;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Data
@Entity
public class Advertisement extends BaseEntity {

    //todo 1 add String washer
    //todo 2 correct design add advertisement

    private String title;
    private LocalDateTime dateTime;
    private AccountType accountType;
    private DealType dealType;
    private RentType rentType;
    private RealEstateType realEstateType;
    private Living living;
    private Commercial commercial;
    private District district;
    private String address;
    private BuildingType buildingType;
    private String description;
    private byte[] photo;
    private int price;
    private boolean communalPayments;
    private NumberOfRooms numberOfRooms;
    private Repairs repairs;
    private int floor;
    private double square;
    private int deposit;
    private String nameOfComplex;
    private int yearOfConstruction;
    private double squareOfLiving;
    private double squareOfKitchen;
    private boolean animal;
    private boolean furniture;
    private boolean windowInside;
    private boolean windowOutside;
    private boolean balcony;
    private boolean loggia;
    private boolean tv;
    private boolean phone;
    private boolean bath;
    private boolean shower;
    private boolean conditioner;
    private boolean internet;
    private boolean separateBathroom;
    private boolean combinedBathroom;
    private boolean lift;
    private boolean ramp;

}
