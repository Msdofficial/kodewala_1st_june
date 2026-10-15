package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5.	Given List<List<String>>, use flatMap() to convert it into a single List<String>.
public class Driver2 {
	
	public static void main(String[] args) 
	{
		List<List<String>> names = Arrays.asList(Arrays.asList("Rahul","Daksh"),Arrays.asList("Masood","Vikash"),
				Arrays.asList("Dharmesh"));
		
		// after using flatMap , we can apply filter.
		List<String> output = names.stream().flatMap(list -> list.stream() ).filter(name -> name.startsWith("D"))
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
				
		System.out.println(output);
		
		long namesCount = names.stream().flatMap(list -> list.stream() ).filter(n -> n.startsWith("D")).map(name -> name.toUpperCase()).count();
		
		System.out.println(namesCount);
	}

}
