package com.kodewala.amazon.inheritance;

// Combining Order , PrimeOrder , BusinessOrder is Hierarchical  inheritance 

public class BusinessOrder extends Order { // child class of parent class(Order).
	
	// all the data and methods of parent class is inherited here by child class.
	
	String user_Type;    // own data
	String gst = "18%";  // own data 
	
	BusinessOrder(String _user_Type , int user_Id)
	{
		super(user_Id);
		this.user_Type = _user_Type;
	}
	
	public void display() 
	{
		super.placeOrder();
		System.out.println("User type : " +user_Type);
		System.out.println("Gst is : "+gst);
	}

}
