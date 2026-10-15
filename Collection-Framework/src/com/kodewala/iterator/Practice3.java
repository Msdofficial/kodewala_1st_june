package com.kodewala.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice3 {
	public static void main(String[] args)
	{
		Map<Integer, String> users = new HashMap<>();

		users.put(101, "Rahul");
		users.put(102, "Amit");
		users.put(103, "Neha");
		
		Iterator<Integer> itr = users.keySet().iterator();
		
		while(itr.hasNext())
		{
			int key = itr.next();
			System.out.println(key);
		}
		
	}
}
