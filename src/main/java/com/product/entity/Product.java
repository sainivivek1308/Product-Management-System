package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String type;
	private String place;
	private int warranty;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, String type, String place, int warranty) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
	}

	public Product(String name, String type, String place, int warranty) {
		super();
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	
	
	public void setPlace(String place) {
		this.place=place;
	}
	public String getPlace() {
		return place;
	}
	
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public int getWarranty() {
		return warranty;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
	}

	
}
