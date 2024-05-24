package com.ftn.sbnz.model.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class IngredientsGroup {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String purpose;
	
	@OneToMany(mappedBy = "ingredientsGroup",
            cascade = CascadeType.ALL,
            orphanRemoval = false)
	private List<Ingredient> ingredients;
	

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


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public IngredientsGroup() {
		super();
	}

	public IngredientsGroup(Long id, String name, String description, String purpose, List<Ingredient> ingredients) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.purpose = purpose;
		this.ingredients = ingredients;
	}
}
