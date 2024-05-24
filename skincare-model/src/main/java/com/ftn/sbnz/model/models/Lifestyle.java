package com.ftn.sbnz.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lifestyle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column
    private boolean isSmoker;

    @Column
    private int averageSleepingHours;

    @Column
    private boolean consumingAlcohol;

    @Column
    private boolean balancedDiet;

    @Column
    private int averageStressLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    public int getAverageSleepingHours() {
        return averageSleepingHours;
    }

    public void setAverageSleepingHours(int averageSleepingHours) {
        this.averageSleepingHours = averageSleepingHours;
    }

    public boolean isConsumingAlcohol() {
        return consumingAlcohol;
    }

    public void setConsumingAlcohol(boolean consumingAlcohol) {
        this.consumingAlcohol = consumingAlcohol;
    }

    public boolean isBalancedDiet() {
        return balancedDiet;
    }

    public void setBalancedDiet(boolean balancedDiet) {
        this.balancedDiet = balancedDiet;
    }

    public int getAverageStressLevel() {
        return averageStressLevel;
    }

    public void setAverageStressLevel(int averageStressLevel) {
        this.averageStressLevel = averageStressLevel;
    }

    public Lifestyle() {
    }

    public Lifestyle(Long id, boolean isSmoker, int averageSleepingHours, boolean consumingAlcohol, boolean balancedDiet, int averageStressLevel) {
        this.id = id;
        this.isSmoker = isSmoker;
        this.averageSleepingHours = averageSleepingHours;
        this.consumingAlcohol = consumingAlcohol;
        this.balancedDiet = balancedDiet;
        this.averageStressLevel = averageStressLevel;
    }
}
