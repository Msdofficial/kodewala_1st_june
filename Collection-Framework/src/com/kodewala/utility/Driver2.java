package com.kodewala.utility;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;

public class Driver2 {
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();
		
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
			
			cities.add("AHM");  
					
		}


		System.out.println(cities);

		
	}
}
