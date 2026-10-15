package com.kodewala.nullpointer.exception; // java.lang.NullPointerException

public class Driver {
	
	public static void main(String[] args)
	{
		System.out.println("main method STARTS,,,");
		
		String name = "MD MASOOD RAZA";
		
		System.out.println("Length of the name is : "+name.length());
		
		String city = null; // Here, the city is null and in java we can not perform any operation on null value. 
		
		System.out.println("Length of the city is : "+city.length()); //java.lang.NullPointerException , but the code
		                                                              // will execute before this line.
		
		System.out.println("main method END. "); // this line will not get executed in this code.
	}
}
