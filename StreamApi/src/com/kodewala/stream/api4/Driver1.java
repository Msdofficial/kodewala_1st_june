package com.kodewala.stream.api4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	
	public static void main(String[] args)
	{
		
		List<String> cities = Arrays.asList("Hyderabad", "Surat", "Mysore" , "Chennai" , "Jaipur" , "Noida" 
				, "Bangalore", "Gurugram" , "Chennai" , "Delhi" , "Mumbai" , "Ahmedabad");
		
		// Here , 'parallelStream()' method will create multiple threads to make the process fast , the number  
		// of threads will not be in our control , it will be decided internally by 'forkJoinPool' class.
		
		List<String> output = cities.parallelStream().filter(w -> w.startsWith("M")).collect(Collectors.toList());
		System.out.println(output);
		
		
	}

}
