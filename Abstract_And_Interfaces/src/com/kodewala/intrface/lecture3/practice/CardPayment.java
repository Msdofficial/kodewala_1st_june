package com.kodewala.intrface.lecture3.practice;

public class CardPayment implements PaymentProcessor {

	@Override
	public void processPayment(double amount) 
	{
		
		System.out.println("Processing Card Payment : "+amount);
		
	}

}