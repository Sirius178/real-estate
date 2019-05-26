package com.new_buildings.entities;


import com.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class NewBuilding implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",unique=true, nullable = false)
    private Long id;
//    @ManyToOne
//  @JoinTable(name = "addresses_id")
    private String address;
    @Lob
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
    @Enumerated(value = EnumType.STRING)
    private Status status;


}
