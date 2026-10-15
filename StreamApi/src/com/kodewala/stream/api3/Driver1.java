package com.kodewala.stream.api3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {
	
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(32 , 33 , 34 , 35 , 36 , 37 , 44 , 46 , 49 , 50 , 51 , 53);
		
		Map<Boolean , List<Integer>> output =  numbers.stream().collect(Collectors.partitioningBy(c -> c%2==0));
		
		System.out.println(output);
	}

}
