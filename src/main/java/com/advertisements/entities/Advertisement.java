package com.advertisements.entities;


import com.advertisements.entities.enums.*;
import com.parent.BaseEntity;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Advertisement extends BaseEntity {

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
    private Byte[] photo;
    private int price;
    private boolean communalPayments;
    private NumberOfRooms numberOfRooms;
    private Repairs repairs;
    private int floor;
    private double square;
    private Addition addition;


}
