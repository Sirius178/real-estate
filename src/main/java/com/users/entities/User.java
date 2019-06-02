package com.users.entities;

import com.parent.Person;
import lombok.Data;

@Data
public class User extends Person {

    private String password;
//    private String authority = "ROLE_USER";



}
