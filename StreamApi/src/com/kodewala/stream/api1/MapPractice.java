package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2.	Given a list of employee names, use map() to convert all names to upper-case.
public class MapPractice {
	
	public static void main(String[] args)
	{
	
		List<String> empNames = Arrays.asList("Masood", "Daksh ", "Muntazir" , "Prajwal" , "Muzammil");
		
		List<String> output = empNames.stream().filter(names -> names.startsWith("M")).map(names -> names.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
	}

}
