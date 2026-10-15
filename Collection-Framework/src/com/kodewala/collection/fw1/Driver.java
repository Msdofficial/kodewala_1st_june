package com.kodewala.collection.fw1;
import java.util.ArrayList;

public class Driver 
{
	public static void main(String [] args) 
	{
		
		//if we want to store objects in the same input order and duplicate objects(here, employee name)
		// we will use ArrayList as collection
		ArrayList<String> employeeNames = new ArrayList<String>(); // creating ArrayList with default capacity (i.e., 10)
		
		
		// Adding elements to ArrayList 
		
		employeeNames.add("Masood");
		employeeNames.add("Masood");
		employeeNames.add("sandeep");
		employeeNames.add("Daksh");
		
		System.out.println(employeeNames);
	}

}
