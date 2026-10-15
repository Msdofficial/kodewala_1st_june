package com.kodewala.strings;

public class StringConcat {
	public static void main(String [] args) 
	{
		String s1 = "Delhi"; // This will make object in SCP 
		String s3 = "Delhi_India"; // This will make object in SCP 
		
		s1.concat("_India"); // This will make one object in SCP and  2nd concated object "Delhi_India" in Heap
		
		// When we want to store Delhi_India in SCP , we can use intern() to copy it in SCP
		
		String s2 = s1.concat("_India").intern();
		
		// When we check the address of s2 and s3 , we will get true because of the intern().
		
		System.out.println(s2 == s3); // true
		
		
		
		
	}

}
