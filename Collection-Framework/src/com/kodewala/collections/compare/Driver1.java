package com.kodewala.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1 {
	
	public static void main(String[] args)
	{
		Customer c1 = new Customer(199, "Rahul");
		Customer c2 = new Customer(100, "Ramesh");
		Customer c3 = new Customer(110, "Daksh");
		
		
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		Collections.sort(customers , new CustomerByIdSorting());
		
		for(int i=0 ; i<customers.size() ; i++) 
		{
			Customer c = customers.get(i);
			System.out.println(c.customerId+ " --> "+c.customerName);
		}
		
	}

}
