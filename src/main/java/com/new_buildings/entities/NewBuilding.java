package com.new_buildings.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Arrays;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class NewBuilding  {

//    @Column(name = "id",unique=true, nullable = false)
    private Long id;
//    @ManyToOne
//  @JoinTable(name = "addresses_id")
    private Address address;

//    @Column(name = "image")
    private Byte[] image;
//    @Column(name = "floor")
    private int floor;
//    @Column(name = "number_of_apartment")
    private int numberOfApartment;
//    @Column(name = "number_of_rooms")
    private int numberOfRooms;
//    @Column(name = "square")
    private double square;
//    @Column(name = "price_per_square")
    private int pricePerSquare;
//    @Column(name = "full_price")
    private int fullPrice;
//    @Column(name = "status")

    private Status status;

    @Override
    public String toString() {
        return "NewBuilding{" +
                "id=" + id +
                ", address='" + address + '\'' +
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
