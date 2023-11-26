package com.eclectics.farmEasepro.Farmer;

import com.eclectics.farmEasepro.Equipments.Equipment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data



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
    @OneToOne
    private Equipment equipment;


}
