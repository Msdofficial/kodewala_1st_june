package com.kodewala.abst;

public abstract class Payment {
	
	public abstract void doPayment(); //Abstract method can not have body.And the child which inherit this class must have doPayment().
	
	public void doValidate()   // This is a normal method , hence automatically be inherited(what + how) by its child class 
	{
		System.out.println("Payment.doValidate()");
	}
	
	// Payment payment = new Payment(); -->You can not create an object of abstract class because it is partially implemented(no body).
	
}
class CardPayment extends Payment{
	@Override
	public void doPayment()  // this is what? --> means what is this method about 
	{
		System.out.println("CardPayment.doPayment()");  // this is how? --> means how will it perform the task.
	}
	@Override
	public void doValidate()
	{
		System.out.println("CardPayment.doValidate()");
	}
}
