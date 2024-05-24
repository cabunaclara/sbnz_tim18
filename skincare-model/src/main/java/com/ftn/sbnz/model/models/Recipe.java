package com.ftn.sbnz.model.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany
    private List<RecipeIngredient> ingredientList;

    @OneToMany
    private List<Advantage> advantageList;

    @OneToMany
    private List<Disadvantage> disadvantageList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RecipeIngredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<RecipeIngredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Advantage> getAdvantageList() {
        return advantageList;
    }

    public void setAdvantageList(List<Advantage> advantageList) {
        this.advantageList = advantageList;
    }

    public List<Disadvantage> getDisadvantageList() {
        return disadvantageList;
    }

    public void setDisadvantageList(List<Disadvantage> disadvantageList) {
        this.disadvantageList = disadvantageList;
    }

    public Recipe() {
    }

    public Recipe(Long id, String name, String description, List<RecipeIngredient> ingredientList, List<Advantage> advantageList, List<Disadvantage> disadvantageList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredientList = ingredientList;
        this.advantageList = advantageList;
        this.disadvantageList = disadvantageList;
    }
}
