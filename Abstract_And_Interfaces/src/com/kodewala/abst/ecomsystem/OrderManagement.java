package com.kodewala.abst.ecomsystem;

public abstract class OrderManagement {
	
	public abstract void placeOrder();
	
	public abstract void editOrder();
	
	public abstract void confirmOrder();
	
	public void getOrderStatus()
	{
		System.out.println("OrderManagement.getOrderStatus()");
	}

}
