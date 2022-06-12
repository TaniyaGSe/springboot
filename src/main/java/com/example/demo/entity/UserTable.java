package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="userr1")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTable {

    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String address;

}
