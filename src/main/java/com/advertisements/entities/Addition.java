package com.advertisements.entities;



import com.model.BaseEntity;
import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Addition extends BaseEntity {
    private Advertisement advertisement;
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
