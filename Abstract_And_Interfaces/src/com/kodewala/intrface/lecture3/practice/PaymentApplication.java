package com.kodewala.intrface.lecture3.practice;

public class PaymentApplication {
	
	public static void main(String[] args) 
	{
		
		PaymentProcessor u1 = new UPIPayment();
		
		if(PaymentProcessor.isValidAmount(500))//u1.isValidAmount(500);❌ because static methods belongs to interface.
		{
			u1.processPayment(500);
			
			u1.generatePaymentReciept();
		}
	}

}
