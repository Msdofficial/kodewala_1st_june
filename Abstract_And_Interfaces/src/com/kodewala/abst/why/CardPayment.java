package com.kodewala.abst.why;

public class CardPayment extends PaymentSystem {
    
	// All the concrete method will be inherited in child classes as usual.
	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("CardPayment.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("CardPayment.stopPayment()");
		
	}
	
	
	// this will needs to be implemented , after adding abstract paymentLimit() method in parent class .
	@Override
	public void paymentLimit() {
		System.out.println("CardPayment.paymentLimit()");
		
	}

}
