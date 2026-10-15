package com.kodewala.collection.fw1.ArrayList;
// REVISION

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product {
	
	public static void main(String[] args)
	{
		List<String> products = new ArrayList<String>();
		
		products.add("Phone");
		products.add("Laptop");
		products.add("Tablet");
		products.add("TV");
		products.add("Headphone");
		products.add("Camera");
		products.add("Projector");
		products.add("Mic");
		products.add("Ac");
		products.add("Fridge");  // After adding 10th element the capacity will not increase by 50% , but 
		products.add("Phone");   // When we will add 11th element the capacity will dynamically increase by 50% . 
		
		System.out.println(products);
		
		products.get(1);   // because of index based , time complexity of reading an arrayList is O(1).
		
		products.remove(2);  // O(n) ,,, because the element will shift to the left.
		
		products.add(3, null);   // O(n) ,,, because element will shift to right.
		
		products.add(6, null);    // we can add as many null values as we want in an arrayList because it can store duplicates.
		
		// NOTE: when we add or remove elements from last , complexity will be O(1) ,,because of no element shifting.
		
		System.out.println(products);
		
		Iterator<String> itr = products.iterator();
		
		while(itr.hasNext())
		{
			String result = itr.next();
			if(result != null) {
			System.out.println(result.contains("b"));
		}
	}
}
	
	

}
