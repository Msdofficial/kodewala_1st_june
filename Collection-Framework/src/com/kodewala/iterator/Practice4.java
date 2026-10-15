package com.kodewala.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Practice4 {
	public static void main(String[] args)
	{
		Map<Integer, String> users = new HashMap<>();

		users.put(101, "Rahul");
		users.put(102, "Amit");
		users.put(103, "Neha");
		
		Iterator<Map.Entry<Integer, String>> itr = users.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+ " = "+entry.getValue());
		}
		
	}
}
