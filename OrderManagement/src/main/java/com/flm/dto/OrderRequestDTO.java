package com.flm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
	
	private long productId;
	
	private int quantity;
	
	private double price;

	public Long getProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
