package com.kodewala.intrface.lecture5;

public class FestivalDiscount implements Order {

	@Override
	public double calculateDiscount(double productPrice) {
		
		if(productPrice > 5000) 
		{
			return productPrice * 20/100;
			
		}
		return productPrice *10 /100;
		
	}

}
