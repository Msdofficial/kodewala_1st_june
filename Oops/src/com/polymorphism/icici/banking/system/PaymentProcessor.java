package com.polymorphism.icici.banking.system;

// L-32_W-7_End of Poly-morphism --> 42:30

// ROUTER
public class PaymentProcessor {
	
	public void processingPayment(Payment payment)
	{
		payment.doPayment();  // this is actually Poly-Morphism --> Based on actual object method will be called.
		
	}

}
