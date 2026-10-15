package com.kodewala.amazon.inheritance;

public class Order {    // parent class
      
	int user_Id;             // data of parent class 
	
	Order(int _user_Id)
	{
		this.user_Id = _user_Id;
	}
	
	Order()
	{
		this(123);
	}
	
	
	public void placeOrder()     // method of parent class 
	{
		System.out.println("===== your Order details is =====");
		System.out.println("Your Order Id : " +user_Id);
	}
	
}
