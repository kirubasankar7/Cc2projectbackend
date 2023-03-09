package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class medical {
	@Id
	private int id;
	private String drugName;
	private String strength;
	private String brand;
	public medical(int id, String drugName, String strength, String brand) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.strength = strength;
		this.brand = brand;
	}
	public medical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}

