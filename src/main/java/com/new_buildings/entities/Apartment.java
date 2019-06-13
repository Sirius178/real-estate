package com.new_buildings.entities;


import com.parent.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Arrays;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Apartment extends BaseEntity {

    private Address address;
    private Byte[] image;
    private int floor;
    private int numberOfApartment;
    private int numberOfRooms;
    private double square;
    private int pricePerSquare;
    private int fullPrice;
    private Status status;

    @Override
    public String toString() {
        return "Apartment{" +
                "address=" + address +
                ", image=" + Arrays.toString(image) +
                ", floor=" + floor +
                ", numberOfApartment=" + numberOfApartment +
                ", numberOfRooms=" + numberOfRooms +
                ", square=" + square +
                ", pricePerSquare=" + pricePerSquare +
                ", fullPrice=" + fullPrice +
                ", status=" + status +
                '}';
    }
}
