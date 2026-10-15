package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1.	Given a list of integers, use filter() to find all numbers greater than 50.
public class FilterPractice {
	
	public static void main(String[] args) 
	{
			//step: 1 ->  Storing data -> always in Collection 
			List<Integer> number = Arrays.asList( 5 , 15 , 25 , 35 , 45 , 55 , 65 , 75 , 85 , 95);
			
			//step: 2 -> Converting Collection to Stream object
			Stream<Integer> streamObj = number.stream();
			
			//step: 3 -> perform operation --> using filter
			Stream<Integer> filteredNumber =  streamObj.filter(nums -> nums > 50);
			
			//step: 4 -> collect or print the filteredNumber
			List<Integer> output = filteredNumber.collect(Collectors.toList());
			System.out.println(output);
			
			
			// We can do the same in one line also --> 
			List<Integer> sameOutput = number.stream().filter(num -> num>50).collect(Collectors.toList()); 
			
			System.out.println(sameOutput);
			
		
	}

}
