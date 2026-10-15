package com.kodewala.utility;

// Collections is a Utility class in which there are several methods which are ready to use in collection.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args)
	{
		List<String> cities = new ArrayList<String>();
		
		cities.add("BLR");
		cities.add("KOL");
		cities.add("BBR");
		cities.add("GGN");
		cities.add("PTN");
		cities.add("CHE");
		
		System.out.println(cities);
		
		Collections.sort(cities);  // return type --> void
		System.out.println(cities);
		
		Collections.reverse(cities);  // return type --> void
		System.out.println(cities);
		
		Collections.synchronizedList(cities);   // return type --> List
		System.out.println(cities);
		
		List<String> unmod = Collections.unmodifiableList(cities);  // return type --> List 
		// unmod.add("AHM");
		System.out.println(unmod);

		int index = Collections.binarySearch( cities , "PTN");
		System.out.println(index);

	}
}
