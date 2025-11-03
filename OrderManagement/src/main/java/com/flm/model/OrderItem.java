package com.flm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderItemId;
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public OrderItem(int quantity, Order order, Product product) {
		super();
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public void setOrder(Order order2) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(int quantity2) {
		// TODO Auto-generated method stub
		
	}

	public void setProduct(Product product2) {
		// TODO Auto-generated method stub
		
	}

	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
