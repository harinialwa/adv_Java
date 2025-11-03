package com.flm.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {
	
	private long orderId;
	
	private String status;
	
	private double totalAmount;
	
	private List<OrderItemResponseDTO> orderItems;

	public void setOrderId(Object orderId2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(Object status2) {
		// TODO Auto-generated method stub
		
	}

	public void setTotalAmount(double totalOrderAmount) {
		// TODO Auto-generated method stub
		
	}

	public void setOrderItems(List<OrderItemResponseDTO> orderItemResponseDTOList) {
		// TODO Auto-generated method stub
		
	}
}
