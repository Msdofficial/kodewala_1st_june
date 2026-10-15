package com.kodewala.intrface.lecture3;

public class CardPayment implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
	}

	@Override
	public void settle() {
		System.out.println("CardPayment.settle()");
		
	}

}

