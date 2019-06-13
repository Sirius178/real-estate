package com.new_buildings.entities;


import com.parent.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import java.util.Arrays;


@Data
@Entity
public class Address extends BaseEntity {

    private String address;
    private Byte[] image;
    private Apartment apartment;


}
