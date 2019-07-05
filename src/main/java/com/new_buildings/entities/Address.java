package com.new_buildings.entities;


import com.parent.BaseEntity;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Set;


@Data
@Entity
public class Address extends BaseEntity {

    private String address;
    private byte[] image;

}
