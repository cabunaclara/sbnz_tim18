package com.ftn.sbnz.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Measurement {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column
    private int number;

    @Column
    private String unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Measurement() {
    }

    public Measurement(Long id, int number, String unit) {
        this.id = id;
        this.number = number;
        this.unit = unit;
    }
}
