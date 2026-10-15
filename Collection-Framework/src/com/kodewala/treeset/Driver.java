package com.kodewala.treeset;

import java.util.TreeSet;
import java.util.Set;

public class Driver {
	
	public static void main(String[] args) 
	{
		// Tree DO NOT use the concept of HASHING  still manages to store UNIQUENESS by implementing  comparable interface 
		// in which there is a method compare to . 
		
		// TreeSet also Stores the element in SORTED manner . 
		
		Set<String> cities = new TreeSet<String>();
		
		cities.add("KOL");
		cities.add("BLR");
		cities.add("CHE");
		cities.add("AHM");
		cities.add("DL");
		
		System.out.println(cities);
	}

}
