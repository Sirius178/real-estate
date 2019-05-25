package com.users.entities;

import com.model.Person;
import lombok.Data;

import javax.persistence.*;

@Data
public class User extends Person {

    private String password;
//    private String authority = "ROLE_USER";



}
