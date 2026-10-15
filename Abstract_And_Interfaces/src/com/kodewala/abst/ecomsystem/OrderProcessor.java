package com.kodewala.abst.ecomsystem;

// ROUTER OR OBJECT_FACTORY
public class OrderProcessor {
		
	public void processingOrder(OrderManagement orderManagement)
	{
		orderManagement.confirmOrder();
		orderManagement.editOrder();
		orderManagement.placeOrder();
		orderManagement.getOrderStatus();
		
	}
}
