package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Farmer {
@Id
    private Long id;

    private String firstName;

    private String lastName;



    private String email;

    private int  phoneNumber;


//    constructor class

    //first consructor
    public Farmer(Long id) {
        this.id = id;
    }

    //second constructor
    public Farmer(Long id,
                  String firstName,
                  String lastName,
                  String email,
                  int phoneNumber
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
//third constructor

//    public Farmer(String firstName, String lastName, String email, int phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

//    getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    to_string

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}


