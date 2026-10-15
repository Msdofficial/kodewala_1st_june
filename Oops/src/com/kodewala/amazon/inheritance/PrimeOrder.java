package com.kodewala.amazon.inheritance;

// single level inheritance 

public class PrimeOrder extends Order{  // child class of parent class(Order)
	
	// all the data and methods of parent class is inherited here by child class.
	
	String user_Type;  // own data 
	int del_Fee = 0;  // own data 
	
	PrimeOrder(String _user_Type )
	{
		super();
		this.user_Type = _user_Type;
	}
	
	public void display() 
	{
		super.placeOrder();
		System.out.println("User type : " +user_Type);
		System.out.println("Delivery fee is : "+del_Fee );
	}

}
