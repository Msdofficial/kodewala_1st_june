package com.kodewala.stream.api.practice;

import java.util.Map;
import java.util.stream.Collectors;

// Count the frequency of each character in a string.
public class Frequency {
	
	public static void main(String[] args)
	{
		
		String fruit = "banana";
		
		Map<Character , Long> output =  fruit.chars().mapToObj(str -> (char)str)
		                                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(output);
	}

}
