package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column//@Column(name = "ID")
    private int id;
    @Column
    private String name;
//    @Column
//    private String lastName;
    @Column
    private String email;
    @Column
    private String phoneN;
    @Column
    private String password;

}
