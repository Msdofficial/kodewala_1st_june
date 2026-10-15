package com.kodewala.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver1 {
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
		
		Iterator<String> itr = cities.iterator();
		
		while(itr.hasNext())
		{
			String element = itr.next();
			
			System.out.println(element);
			// adding or removing this way is not allowed  
			cities.remove(3);  // will throw ConcurrentModificationException
					
		}




		
	}
}
