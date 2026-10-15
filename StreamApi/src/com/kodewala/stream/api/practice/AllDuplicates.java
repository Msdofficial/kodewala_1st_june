package com.kodewala.stream.api.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Find all duplicate elements in the list.

public class AllDuplicates {
	
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Masood" , "Daksh" , "Masood" , "Raza" , "Daksh" , "Masood");
		
		// 1. Convert collection in to stream object 
		// 2. using filter add the names in set to implement set characteristics
		// 3. print it using forEach.
		
		Set<String> set = new HashSet<>();
		names.stream().filter(name ->! set.add(name)).forEach(name -> System.out.println(name));
		// The above code will fail if our task will be, to print duplicates only once whether it comes 2,3,...,n times.
		
		// the better approach will be :
		Set<String> set1 = new HashSet<>();
		Set<String> out = names.stream().filter(name ->! set1.add(name)).collect(Collectors.toSet());
		System.out.println(out);
			
		// OR
		Set<String> output1 = names.stream().filter(name -> Collections.frequency(names, name) > 1).collect(Collectors.toSet());
		System.out.println(output1);

	}

}
