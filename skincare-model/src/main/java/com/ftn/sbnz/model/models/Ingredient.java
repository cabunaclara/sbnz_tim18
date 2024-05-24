package com.ftn.sbnz.model.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
public class Ingredient {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	public String name;
	
	@Column
	public String description;
	
	@Column
	public int harmfulness;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonIgnore
    private IngredientsGroup ingredientsGroup;

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

	public int getHarmfulness() {
		return harmfulness;
	}

	public void setHarmfulness(int harmfulness) {
		this.harmfulness = harmfulness;
	}

	public IngredientsGroup getIngredientsGroup() {
		return ingredientsGroup;
	}

	public void setIngredientsGroup(IngredientsGroup ingredientsGroup) {
		this.ingredientsGroup = ingredientsGroup;
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

	public Ingredient() {
		super();
	}

	public Ingredient(Long id, String name, String description, int harmfulness, IngredientsGroup ingredientsGroup, List<Advantage> advantageList, List<Disadvantage> disadvantageList) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.harmfulness = harmfulness;
		this.ingredientsGroup = ingredientsGroup;
		this.advantageList = advantageList;
		this.disadvantageList = disadvantageList;
	}
}
