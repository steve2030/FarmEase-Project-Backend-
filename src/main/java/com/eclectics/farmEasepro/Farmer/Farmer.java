package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmer {
    @Id
//
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String phoneNo;
    private String County;
    private String localArea;

//    default constructor

    public Farmer(Long id) {
        this.id = id;
    }

//    the other constructor

    public Farmer(Long id,
                  String firstName,
                  String secondName,
                  String email,
                  String phoneNo,
                  String county,
                  String localArea) {

        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phoneNo = phoneNo;
        County = county;
        this.localArea = localArea;
    }

}
