package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	@Column(nullable = false, unique = true)
	private String productName;
	
	@Column(nullable = false)
	private double price;
	
	private double discount;
	
	private double rating;
	
	@Column(nullable = false)
	private boolean isAvailable;
	
	@Column(nullable = false)
	private int stock;
	
	public Product(String productName, double price, double discount, double rating, boolean isAvailable, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.isAvailable = isAvailable;
		this.stock = stock;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getStock() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getProductId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getProductName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setProductName(Object productName2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}

	public void setDiscount(Object discount2) {
		// TODO Auto-generated method stub
		
	}

	public void setStock(Object stock2) {
		// TODO Auto-generated method stub
		
	}

	public void setAvailable(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setRating(double rating2) {
		// TODO Auto-generated method stub
		
	}
	
}
