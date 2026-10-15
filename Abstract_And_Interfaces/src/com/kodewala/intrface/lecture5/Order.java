package com.kodewala.intrface.lecture5;

public interface Order {
	
	double calculateDiscount(double productPrice);  // This is by default "public abstract".
	
	default void displayDiscount(double discount)
	{
		System.out.println("Discount applied: "+discount);
		
	}
	static boolean isValidPrice(double price)
	{
		if(price> 0) return true;
		return false;
	}
	
}
