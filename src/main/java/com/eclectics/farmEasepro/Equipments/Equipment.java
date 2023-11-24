package com.eclectics.farmEasepro.Equipments;

import com.eclectics.farmEasepro.Farmer.Farmer;
import jakarta.persistence.*;


@Entity


public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String model;
    private Boolean available;
    private int rate;


    public Equipment() {

    }

    public Equipment(Long id, String type, String model, Boolean available, int rate) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.available = available;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", available=" + available +
                ", rate=" + rate +
                '}';
    }
}

