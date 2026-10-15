package com.atm.encp;

public class BankAccount 
{
	private double balance = 10000.0;
	private String PIN = "Msd@000";
	
	public void withdraw(double withdrawAmount , String Pin) 
	{
		System.out.println("Amount before withdrawl: "+balance);
		System.out.println("Amount to be withdrawn : "+withdrawAmount);
		if(Pin.equals(PIN)&& withdrawAmount<=balance) 
		{
		balance -= withdrawAmount;
		System.out.println("amount after withdrawl : "+balance);
		}
		else
		{
			System.out.println("Transaction declined .....invalid amount or pin !!!");
		}
	}
}
