package com.kodewala.stringbuilder;

public class Driver {
	public static void main(String[] args)
	{
		QueryConstructor queryConstructor = new QueryConstructor();
		
		String output = queryConstructor.constructQuery(null,10000);
		
		System.out.println(output);
	}

}
