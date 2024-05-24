package com.ftn.sbnz.model.models;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name = "place", nullable = false)
    private String place;

    @Column(name = "state", nullable = false)
    private String state;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address() {
    }

    public Address(Long id, String place, String state) {
        this.id = id;
        this.place = place;
        this.state = state;
    }
}
