package com.kodewala.intrface.lecture3;

public class WireTransfer implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("WireTransfer.pay()");
	}

	@Override
	public void settle() {
		System.out.println("WireTransfer.settle()");
		
	}

}

