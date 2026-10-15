package com.kodewala.stream.api3;

public class Driver3 {
	
	public static void main(String[] args)
	{
		String input = "swiss";
		
		Character output = input.chars().mapToObj(c -> (char)c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
		                   .findFirst().get();
		
		System.out.println(output);
		
	}

}
