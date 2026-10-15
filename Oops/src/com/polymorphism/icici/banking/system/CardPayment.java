package com.polymorphism.icici.banking.system;

public class CardPayment extends Payment {
	@Override
	public void doPayment()
	{
		System.out.println("CardPayment.DoPayment()-------- doing card payment");
	}

}
