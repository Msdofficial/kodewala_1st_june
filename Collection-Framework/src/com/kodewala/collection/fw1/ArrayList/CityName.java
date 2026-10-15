package com.kodewala.collection.fw1.ArrayList;
import java.util.*;
public class CityName
{
	public ArrayList<String> cityName(){

		ArrayList<String> city = new ArrayList<String>();

		city.add("Bangalore");
		city.add("Kolkata");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Mysore");
		city.add("Hyderabad");
		city.add("Kolkata");

		return city;
	}

	public static void main(String [] args) 
	{
		//Creating object
		CityName cityName = new CityName();

		//Storing cityName in cities ArrayList
		ArrayList<String> cities = cityName.cityName();

		cities.add(3,"Pune");// adding element 
		cities.remove(6); // removing element 

		System.out.println(cities);

		// performing operation
		for(String city : cities)
		{
			System.out.println(city.contains("l"));	
		}

	}
}
