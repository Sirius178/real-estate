package com.new_buildings.entities;


import com.model.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Set;


@Data

public class Address extends BaseEntity {

//    @Column(name = "address")
    private String address;
    @Lob
//    @Column(name = "image")
    private Byte[] image;

}
