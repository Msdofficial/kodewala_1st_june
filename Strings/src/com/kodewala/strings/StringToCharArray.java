package com.kodewala.strings;

public class StringToCharArray {
	public static void main(String[] args)
	{
		String city = "BANGALORE";
		
		// converting a string to char array using for each loop
		char [] arr = city.toCharArray();
		for(char abc : arr) 
		{
			System.out.println(abc);
		}
		
		System.out.println(city.contains("GALO"));   // true
		System.out.println(city.contains("Masood"));   // false
		System.out.println(city.startsWith("BANG"));   // true 
		System.out.println(city.endsWith("BANG"));    //false
	}

}
