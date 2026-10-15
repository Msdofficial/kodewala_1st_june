package com.kodewala.nullpointer.exceptionhandling;

public class Driver {
	
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		System.out.println("main method STARTS,,,");
		
		try   // Because of try and catch block , code execution will not stop abnormally.
		{
		String name = "MD MASOOD RAZA";
		
		System.out.println("Length of the name is : "+name.length());
		
		String city = null;  
		
		System.out.println("Length of the city is : "+city.length());
		}
		
		catch (NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("Exception : city is null.");
		}
		
		System.out.println("main method END. "); 
	}
}

