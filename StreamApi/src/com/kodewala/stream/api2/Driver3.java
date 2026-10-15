package com.kodewala.stream.api2;

import java.util.Arrays;
import java.util.List;

public class Driver3 {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(45000, 62000, 45000, 71000, 55000, 250000, 48000, 67000, 52000, 83000);
		
		// first collection --> stream object 
		// find distinct salary 
		// sort the salary 
		// skip 2 salaries
		// then apply , find first ()
		
		int output = list.stream().distinct().sorted((a,b) -> b-a).skip(2).findFirst().get();
		
		System.out.println(output);
	}

}
