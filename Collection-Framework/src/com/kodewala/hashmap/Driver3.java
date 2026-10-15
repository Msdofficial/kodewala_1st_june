package com.kodewala.hashmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Driver3 {
	
	public static void main(String[] args)
	{ 
		Set<String> set = new HashSet<String>();
		
		// creating new HashMap
		Map<String , String > map = new HashMap<String , String>();
		
		// Map has both keys and values and all the operation will be performed on key only.
		
		map.put("Karnataka", "BLR");
		map.put("Gujrat", "Gandhi Nagar");
		map.put("Gujrat", "GN");
		map.put("Punjab", "Chandigarh");
		map.put("Haryana", "Chandigarh");
		
		System.out.println(map);
		System.out.println("\n");
		
		Set<Entry<String , String>> entrySet =  map.entrySet();
		Iterator<Entry<String , String>> itr =  entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<String , String > result = itr.next();
			System.out.println(result.getKey()+ "  -   " +result.getValue());
			
		}
		System.out.println("\n");
		Iterator<String> iterator = map.values().iterator();
		
		while(iterator.hasNext())
		{
			String values = iterator.next();
			System.out.println(values);
		}
		
	}
}