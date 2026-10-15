package com.kodewala.nullpointer.exception;  // "java.lang.ArrayIndexOutOfBoundsException"

public class Driver1 {
	
	public static void main(String[] args) 
	{
		System.out.println("main method starts,,,");
		
		String name = args[0];
		
		System.out.println(name.length()); // "java.lang.ArrayIndexOutOfBoundsException" because we are not passing any 
		// value in command line argument.
		
		System.out.println("main method END.");
		
		
	}

}
