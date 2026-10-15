package com.kodewala.intrface.lecture3;

public class UPI implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("UPI.pay()");
	}

	@Override
	public void settle() {
		System.out.println("UPI.settle()");
		
	}

}
