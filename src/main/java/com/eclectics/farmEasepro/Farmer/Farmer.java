package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.*;

@Entity

public class Farmer {
@Id

//@GeneratedValue(strategy = GenerationType.IDENTITY)
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String firstName;

    private String lastName;



    private String email;

    private String phoneNumber;


//    constructor class
//default constructor class

    public Farmer(Long id) {
        this.id = id;
    }

    //second constructor

    public Farmer(Long id, String firstName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


//    getters and setters




//    to_string


}


