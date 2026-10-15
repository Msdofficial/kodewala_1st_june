package com.kodewala.intrface.lecture5;  // Functional interface

@FunctionalInterface  // interface with only one abstract method will automatically be a functional interface.
interface IDiscount {
	
	int applyDiscount(int price , int discount);

}


interface FestivalDiscount1 extends IDiscount{   // This is not a functional interface, because it inherits its parent 
	                                          // method also.So, more than one method --> not a functional interface.
	int applyFestivalDiscount(int price , int discount);
}


public class DiscountCalculator{
	
	public static void main(String[] args) 
	{
		IDiscount discount = (prc , disc) ->
		{
			int discAmount = prc * disc / 100;
			return discAmount;
		};
		
		int amtToBeDiscounted = discount.applyDiscount(1000, 15);
		System.out.println(amtToBeDiscounted);
	}
}