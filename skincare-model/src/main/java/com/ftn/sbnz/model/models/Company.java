package com.ftn.sbnz.model.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

	@Column
	private String name;

	@OneToMany
	private List<ProductLine> lineList;

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

	public List<ProductLine> getLineList() {
		return lineList;
	}

	public void setLineList(List<ProductLine> lineList) {
		this.lineList = lineList;
	}

	public Company() {
	}

	public Company(Long id, String name, List<ProductLine> lineList) {
		this.id = id;
		this.name = name;
		this.lineList = lineList;
	}

}
