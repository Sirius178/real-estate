package com.users.entities;


import com.model.Person;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Data
public class Admin extends Person {

    private String password;

}
