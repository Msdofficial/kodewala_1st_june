package com.kodewala.intrface.lecture5;

public class Driver {
	
	public static void main(String[] args)
	{
		Payment p1 = (priciple , rate , time) -> (priciple*rate*time)/100;
		
		System.out.println(p1.result(1000, 10, 2));   
	}

}
