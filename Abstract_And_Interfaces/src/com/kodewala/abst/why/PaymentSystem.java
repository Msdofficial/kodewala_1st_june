package com.kodewala.abst.why;

public abstract class PaymentSystem {
	
	public abstract void pay();    // this is What?--> means what will this method do , how it will do will be written 
	public abstract void suspendPayment();  // in the child class , for different child class the functionality can be 
	public abstract void stopPayment();   // different 
	
	// payment limit required after 1 year then we can simply do ,
	public abstract void paymentLimit();
	
	
	// Common Functionalities.
	public void checkStatus()   // This is concrete method , means ( what? + How? ) , it can exist and will act like a normal 
	{                           // method and all the things can be done on this method in child classes as usual.
		System.out.println("PaymentSystem.checkStatus()");
	}
	
	public void checkStatus(int a)   // It can also be overridden 
	{
		System.out.println("PaymentSystem.checkStatus(): "+a);
	}

}
