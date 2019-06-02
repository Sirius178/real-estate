package com.users.entities;


import com.parent.Person;
import lombok.*;


@Data
public class Admin extends Person {

    private String password;

}
