package com.kodewala.abst.why;

public class ObjectFactory {
	
	public void paymentProcessor(PaymentSystem paymentSystem)
	{
		paymentSystem.pay();
		paymentSystem.suspendPayment();
		paymentSystem.stopPayment();
		paymentSystem.checkStatus();
		paymentSystem.checkStatus(1000);
	}

}
