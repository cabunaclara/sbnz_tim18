package com.ftn.sbnz.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Environment {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column
    private boolean polution;

    @Column
    private boolean increasedHumidity;

    @Column
    private boolean sunnyWeather;

    @Column
    private boolean coldWeather;

    @Column
    private boolean hardWater;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPolution() {
        return polution;
    }

    public void setPolution(boolean polution) {
        this.polution = polution;
    }

    public boolean isIncreasedHumidity() {
        return increasedHumidity;
    }

    public void setIncreasedHumidity(boolean increasedHumidity) {
        this.increasedHumidity = increasedHumidity;
    }

    public boolean isSunnyWeather() {
        return sunnyWeather;
    }

    public void setSunnyWeather(boolean sunnyWeather) {
        this.sunnyWeather = sunnyWeather;
    }

    public boolean isColdWeather() {
        return coldWeather;
    }

    public void setColdWeather(boolean coldWeather) {
        this.coldWeather = coldWeather;
    }

    public boolean isHardWater() {
        return hardWater;
    }

    public void setHardWater(boolean hardWater) {
        this.hardWater = hardWater;
    }

    public Environment() {
    }

    public Environment(Long id, boolean polution, boolean increasedHumidity, boolean sunnyWeather, boolean coldWeather, boolean hardWater) {
        this.id = id;
        this.polution = polution;
        this.increasedHumidity = increasedHumidity;
        this.sunnyWeather = sunnyWeather;
        this.coldWeather = coldWeather;
        this.hardWater = hardWater;
    }
}
