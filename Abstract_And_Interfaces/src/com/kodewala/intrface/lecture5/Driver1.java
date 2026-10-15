package com.kodewala.intrface.lecture5;

public class Driver1 {
	
	public static void main(String[] args) 
	{
		Order o1 = new FestivalDiscount();
		
		double price =6000;
		
		if(Order.isValidPrice(price))
		{
			double discount =o1.calculateDiscount(price);
			o1.displayDiscount(discount);
		}
		
		
		
		
	}

}
