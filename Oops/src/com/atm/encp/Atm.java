package com.atm.encp;

public class Atm 
{
	private double balance = 1000.0;
	private String pin = "1234";
	
	public void withdrawl(double amountToWithdraw , String enteredPin) 
	{
		System.out.println("Available balance is : "+balance);
		if(enteredPin.equals(pin) && amountToWithdraw <= balance) {
			balance -= amountToWithdraw;
			System.out.println("Balance post withdrawl : "+balance);
		}
		else 
		{
			System.out.println("Entered wrong pin or insufficient amount!!!");
		}
	}
	public void deposit(double amountToDeposit , String enteredPin) 
	{
		if(amountToDeposit>0 && enteredPin.equals(pin)) 
		{
			balance += amountToDeposit;
			System.out.println(amountToDeposit+" deposited.New balance: "+balance);
		}
		else
		{
			System.out.println("Entered wrong Pin or balance to be added ");
		}
	}
	
}
