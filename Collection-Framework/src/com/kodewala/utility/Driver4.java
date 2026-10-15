package com.kodewala.utility;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
public class Driver4 {

	public static void main(String[] args) 
	{
		// fail safe
		Set<String> cities = new CopyOnWriteArraySet<String>();

		cities.add("BLR");
		cities.add("PTN");
		cities.add("AHM");
		cities.add("KOL");
		cities.add("CHE");

		Iterator<String> itr = cities.iterator();

		while(itr.hasNext())
		{
			String cityName = itr.next();
			
			System.out.println(cityName);
			
			cities.remove("BLR");
		}
		System.out.println(cities);
	}

}
