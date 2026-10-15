package com.kodewala.stream.api3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	
	public static void main(String[] args) 
	{
		List<String> cities = Arrays.asList("Hyderabad", "Surat", "Mysore" , "Chennai" , "Jaipur" , "Noida" 
				, "Bangalore", "Gurugram" , "Chennai" , "Delhi" , "Mumbai" , "Ahmedabad");
		
		Long output = cities.stream().collect(Collectors.counting());
		System.out.println(output);
		
		Map<Integer, List<String>> output1 = cities.stream().collect(Collectors.groupingBy(c -> c.length()));
		
		System.out.println(output1);
		
	}

}
