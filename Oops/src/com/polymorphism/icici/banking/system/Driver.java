package com.polymorphism.icici.banking.system;

// CLIENT
public class Driver {
	
	public static void main(String[] args)
	{
		PaymentProcessor processor = new PaymentProcessor();
		
		Payment _payment = new PhonePayPayment();   // AUTO UPCASTING.
		
		processor.processingPayment(_payment);
	}

}
