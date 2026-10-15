package com.kodewala.strings;

public class PlacementImportant {
	public static void main(String[] args)
	{
		String city = "Bangalore_India";
		
		char [] arr = city.toCharArray();
		
		System.out.println(arr);
		
		for(int i=0 ; i<arr.length ; i++)  
		{
			char ch = arr[i];
			
			if(city.indexOf(ch) != city.lastIndexOf(ch))  // Repeated character
			{
				System.out.println(ch);
			}
		}
		System.out.println(".................................");
		for(int i=0 ; i<arr.length ; i++)  
		{
			char ch = arr[i];
			
			if(city.indexOf(ch) == city.lastIndexOf(ch))  // non-repeated character
			{
				System.out.println(ch);
			}
		}
		System.out.println(".................................");
		for(int i=0 ; i<arr.length ; i++)  
		{
			char ch = arr[i];
			
			if(city.indexOf(ch) == city.lastIndexOf(ch))  // first non-repeated character
			{
				System.out.println(ch);
				break;
			}
		}
	}

}
