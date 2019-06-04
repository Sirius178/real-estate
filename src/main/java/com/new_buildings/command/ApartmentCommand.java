package com.new_buildings.command;

import com.new_buildings.entities.Address;
import com.new_buildings.entities.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
@Setter
@Getter
@NoArgsConstructor
public class ApartmentCommand {

    private Long id;
    private Address address;
    private Byte[] image;
    private int floor;
    private int numberOfApartment;
    private int numberOfRooms;
    private double square;
    private int pricePerSquare;
    private int fullPrice;
    private Status status;
}
