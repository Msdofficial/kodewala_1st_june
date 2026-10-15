package com.kodewala.amazon.inheritance;

public class Driver {
	
	public static void main(String[] args)
	{
		PrimeOrder primeOrder  = new PrimeOrder("Prime_User"); 
		primeOrder.display();
		
		BusinessOrder businessOrder = new BusinessOrder("Business_User" , 321);
		businessOrder.display();
	}

}
