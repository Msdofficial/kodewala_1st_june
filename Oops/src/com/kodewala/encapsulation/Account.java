package com.kodewala.encapsulation;

public class Account {
	
	private int balance;
	
	public int getBalance() 
	{
		return balance;
	}
	
	public void setBalance(int balance) 
	{
		if(balance > 0)
		{
			this.balance = balance ;
		}
	}
	
	public String name;

}
