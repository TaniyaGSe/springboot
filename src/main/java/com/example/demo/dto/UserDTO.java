package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {


    private int id;
    private String name;
//    private String lastName;
    private String email;
    private String phoneN;
    private String password;


}
