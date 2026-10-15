package com.kodewala.strings;

public class StringBuilderPractice {
	public static void main(String[] args) 
	{
		String city = new String("Bangalore");  // Here one object in SCP and one in Heap refer by city
		city.concat("_India");    // one object _India in SCP and one more Bangalore_India in Heap 
		System.out.println(city);  // Output --> Bangalore 
		// Here concat will re-assign the object in heap to make another object with content "Bangalore_India.
		// Total object created in above example is 4 which is not efficient . Hence, we will use StringBuilder 
		// or StringBuffer to modify elements 
		
		StringBuilder city1 = new StringBuilder("Kolkata");  // One object will be created in SCP and one in Heap 
		city1.append("_India");  // one object will be in SCP and the previous heap object will get modified as Kolkata_India
		System.out.println(city1); // Output --> Kolkata_India
		// Here append will modify the existing object in heap to Kolkata_India referring same reference city1.
		//  Total object created in above example is 3 which is efficient than the previous example.
	}

}
