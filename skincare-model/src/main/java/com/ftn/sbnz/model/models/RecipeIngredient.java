package com.ftn.sbnz.model.models;

import javax.persistence.*;

@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne
    private Measurement measurement;

    @ManyToOne
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public RecipeIngredient() {
    }

    public RecipeIngredient(Long id, Measurement measurement, Ingredient ingredient) {
        this.id = id;
        this.measurement = measurement;
        this.ingredient = ingredient;
    }
}
