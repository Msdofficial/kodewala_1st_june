package com.atm.encp;

public class User  
{
	public static void main(String [] args ) 
	{
		Atm atm = new Atm();
		//atm.balance= 12000; this will throw error as balance is not visible in this class due to private access modifier.
		atm.deposit(200, "1234");
		atm.withdrawl(300, "1234");
	}
}
