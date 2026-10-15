package com.kodewala.stream.api3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {
	
	public static void main(String[] args) 
	{
		String input = "Hello";
		
		List<Character> output = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		
		System.out.println(output);
		
		
		String input1 = "Swiss";
		
		Map<Character , Long> output1 = input1.chars().mapToObj(c -> (char)c)
				                        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
		
		System.out.println(output1);
	}
}
