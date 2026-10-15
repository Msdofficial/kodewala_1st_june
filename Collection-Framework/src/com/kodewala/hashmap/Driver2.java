package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Driver2 {
	
	public static void main(String[] args)
	{ 
		// creating new HashMap
		
		Map<String , String > map = new HashMap<String , String>();
		
		// Map has both keys and values and all the operation will be performed on key only.
		
		map.put("Karnataka", "BLR");
		map.put("Gujrat", "Gandhi Nagar");
		map.put("Gujrat", "GN");
		map.put("Punjab", "Chandigarh");
		map.put("Haryana", "Chandigarh");
		
		System.out.println(map);
		
		// creating LinkedHashMap
		Map<String , String > LinkedHashmap = new LinkedHashMap<String , String>();
		
		LinkedHashmap.put("Karnataka", "BLR");
		LinkedHashmap.put("Gujrat", "Gandhi Nagar");
		LinkedHashmap.put("Gujrat", "GN");
		LinkedHashmap.put("Punjab", "Chandigarh");
		LinkedHashmap.put("Haryana", "Chandigarh");
		
		System.out.println(LinkedHashmap);
		
		// creating TreeMap
		Map<String , String > treeMap = new TreeMap<String , String>();
		
		treeMap.put("Karnataka", "BLR");
		treeMap.put("Gujrat", "Gandhi Nagar");
		treeMap.put("Gujrat", "GN");
		treeMap.put("Punjab", "Chandigarh");
		treeMap.put("Haryana", "Chandigarh");
		
		System.out.println(treeMap);
		
	}

}
