package com.kodewala.strings;

public class ClassWork {
	public static void main(String[] args) 
	{
		String str = "KOLKATA";
		String str2 = "  KOLKATA_INDIA  ";
		String[] split = str2.split("_");   //   SPLIT PROBLEM 
		String str3 = str.concat(str2);
		
		System.out.println(str.charAt(1));     // output --> O
		
		System.out.println(str.substring(3));  // output --> KATA
		
		System.out.println(str.substring(3,6)); // output --> KAT
		
		System.out.println(str.replace('K', 'C'));  // output --> COLCATA
		
		System.out.println(split);     // KOLKATA INDIA
		
		System.out.println(str3);    //output--> KOLKATA  KOLKATA_INDIA 
		
		System.out.println(str2.trim());   // output--> KOLKATA_INDIA
		
	}

}
