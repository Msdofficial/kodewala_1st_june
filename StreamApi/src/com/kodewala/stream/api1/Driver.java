package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Driver {
	
	public static void main(String[] args)
	{
		//1. Storing the data --> always in collection
		List<String> cities = Arrays.asList("BLR", "CHE" , "HYD" , "AHM" , "KOL");
		
		//2. Converting the collection to stream object. 
		Stream<String> inputStream =cities.stream();
		
		//3. finding the name starts with 'A' --> using filter
		Stream<String> filteredStream = inputStream.filter(city -> city.startsWith("A"));
		
		//4. Collecting or printing the data 
		List<String> cityStartsWithA = filteredStream.collect(Collectors.toList());
		
		System.out.println(cityStartsWithA);
		
		// We can do the above steps in one line also.
		
		List<String> output = cities.stream().filter(c -> c.startsWith("A")).collect(Collectors.toList());
		System.out.println(output);
		
	}

}
