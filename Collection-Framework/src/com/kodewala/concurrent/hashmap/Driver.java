package com.kodewala.concurrent.hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Driver {
	
	public static void main(String[] args)
	{
		Map<String , Integer> product  = new ConcurrentHashMap<String , Integer>();
		
		product.put("Phone",50000);
		product.put("TV",40000);
		product.put("Tablet",30000);
		product.put("Laptop",60000);
		product.put("Headphone",1000);
		
		
	}

}
