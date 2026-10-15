package com.kodewala.intrface.lecture3.practice;

public class UPIPayment implements PaymentProcessor {

	@Override
	public void processPayment(double amount) 
	{
		
		System.out.println("Processing UPI Payment : "+amount);
		
	}

}
