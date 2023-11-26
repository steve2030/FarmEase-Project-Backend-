package com.eclectics.farmEasepro.Equipments;

import com.eclectics.farmEasepro.Farmer.Farmer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String model;
    private Boolean available;
    private int rate;



}

