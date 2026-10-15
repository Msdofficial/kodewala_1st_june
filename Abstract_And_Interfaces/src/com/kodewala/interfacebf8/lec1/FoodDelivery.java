package com.kodewala.interfacebf8.lec1;

public interface FoodDelivery {
	
	public abstract void createAccount();
	public abstract void logIn();
	void placeOrder();  // all the methods in interface are " public abstract " by default, whether we write it or not.
	abstract void trackOrder();    
	public void deliveryStatus(); 
	
	// It can have constant variables and abstract methods only. 
	// There will be no concrete method in interface , interface is 100% contract based. 
	
}
