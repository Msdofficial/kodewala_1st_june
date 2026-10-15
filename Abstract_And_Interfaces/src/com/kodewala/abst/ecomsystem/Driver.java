package com.kodewala.abst.ecomsystem;

//CLIENT
public class Driver {
		
	public static void main(String[] args) 
	{
		OrderProcessor orderProcessor = new OrderProcessor();
		
		OrderManagement _orderManagement = new RetailUsers();
		
		orderProcessor.processingOrder(_orderManagement);
		
	}
}
