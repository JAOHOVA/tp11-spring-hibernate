package com.m2i.formation.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue 
	private int id;  
	private String reference;
	private String designation;
	private double price; 
	private int amount; // quantit�  
	private Date created; 
	private Date updated;
	
	
	public Product() {
	}
	
	public Product(String reference, String designation, double price, int amount, Date created, Date updated) {
		this.reference = reference;
		this.designation = designation;
		this.price = price;
		this.amount = amount;
		this.created = created;
		this.updated = updated;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	} 
	
	
	
}