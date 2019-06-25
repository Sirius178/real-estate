package com.new_buildings.entities;


import com.parent.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Set;


@Data
@Entity
public class Address extends BaseEntity {

    private String address;
    private Byte[] image;


    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
