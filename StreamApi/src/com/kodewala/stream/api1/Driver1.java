package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rahul","Daksh","Masood","Vikash","Dharmesh");
		
		List<String> output = names.stream().filter(n -> n.startsWith("D")).map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		long namesCount = names.stream().filter(n -> n.startsWith("D")).map(name -> name.toUpperCase()).count();
		
		System.out.println(namesCount);
	}

}
