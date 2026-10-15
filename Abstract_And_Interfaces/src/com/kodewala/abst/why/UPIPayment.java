package com.kodewala.abst.why;

public class UPIPayment extends PaymentSystem {
	// All the below overridden methods are compulsory to be implemented otherwise the compilation will get fail. This brings the 
	// central control , if any functionality like payment limit will be needed in future we can directly make an abstract method 
	// in PaymentSystem and it will force all the child classes to implement it , otherwise all classes will start failing.
	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");  // this is "How?" part and can differ according to the useCase of child class.
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("UPIPayment.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("UPIPayment.stopPayment()");
		
	}
	
	
	// this needs to be implemented ***
	@Override
	public void paymentLimit() {
		System.out.println("UPIPayment.paymentLimit()");
		
	}
	
	

}
