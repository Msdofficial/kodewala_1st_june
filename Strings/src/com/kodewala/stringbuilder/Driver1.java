package com.kodewala.stringbuilder;

public class Driver1 {
	public static void main(String[] args)
	{
		HomeWorkQuery homeWorkQuery = new HomeWorkQuery();
		
		 String output = homeWorkQuery.queryConstructor("ECE", 100000, "15-08-2026");
		 
		 System.out.println(output);
		
	}

}
