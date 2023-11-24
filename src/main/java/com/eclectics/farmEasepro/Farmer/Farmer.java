package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.*;

@Entity

public class Farmer {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private String email;
    @Column
    private String phoneNo;
    @Column
    private String County;
    @Column
    private String localArea;





}
