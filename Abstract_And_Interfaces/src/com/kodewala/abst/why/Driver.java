package com.kodewala.abst.why;

// CLIENT
public class Driver {
	
	public static void main(String[] args) 
	{
		
		ObjectFactory obj = new ObjectFactory();
		
		PaymentSystem p1 = new UPIPayment();
		
		obj.paymentProcessor(p1);
		
	}

}
