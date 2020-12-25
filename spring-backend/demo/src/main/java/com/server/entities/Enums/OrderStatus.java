package com.server.entities.Enums;

public enum OrderStatus {
	
	waitting_payment(1),
	paid(2),
	shipped(3),
	delivered(4),
	canceled(5);
	
	private int code;
	
	private OrderStatus( int code ) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus values: OrderStatus.values()) {
			if(values.getCode() == code) {
				return values;
			}
		}
		throw new IllegalArgumentException("Invalid order status code");
	}
}
