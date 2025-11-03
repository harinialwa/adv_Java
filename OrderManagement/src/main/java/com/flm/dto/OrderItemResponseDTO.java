package com.flm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemResponseDTO {
	
	private long productId;
	
	private String productName;
	
	private long quantity;
	
	private double eachProductPrice;
	
	private double totalProductPrice;

	public void setProductId(long productId2) {
		// TODO Auto-generated method stub
		
	}

	public void setEachProductPrice(double eachProductPrice2) {
		// TODO Auto-generated method stub
		
	}

	public void setProductName(Object productName2) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(double quantity2) {
		// TODO Auto-generated method stub
		
	}

	public void setTotalProductPrice(double totalProductPrice2) {
		// TODO Auto-generated method stub
		
	}

}
