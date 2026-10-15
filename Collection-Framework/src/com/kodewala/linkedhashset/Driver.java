package com.kodewala.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {
	
	public static void main(String[] args) 
	{
		// LinkedHashSet works same as HashSet but it is introduced to maintain the ordered output means the order we insert in 
		// will reflect the same order in output.
		
		// It is used for storing UNIQUE and ORDERED elements , UNIQENESS is maintained by HASHING while ORDERED is maintained
		// by a doubly linked list.
		
		
		Set<String> cities = new LinkedHashSet<String>();
		
		cities.add("KOL");
		cities.add("BLR");
		cities.add("CHE");
		cities.add("AHM");
		cities.add("DL");
		
		System.out.println(cities);
	}

}
