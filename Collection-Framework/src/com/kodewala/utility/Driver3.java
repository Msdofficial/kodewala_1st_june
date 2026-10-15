package com.kodewala.utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver3 {
	public static void main(String[] args) 
	{
		// fail fast
		Set<String> product = new HashSet<String>();

		product.add("Phone");
		product.add("TV");
		product.add("Laptop");
		product.add("Headphone");

		Iterator<String> itr = product.iterator();

		while(itr.hasNext())
		{
			String products = itr.next();
			System.out.println(products);

			// Difference between (Set.remove())  AND (Iterator.remove()).
			product.remove("TV");  // (Set.remove()) --> This will always throw ConcurrentModificationException
			itr.remove();      // (Iterator.remove()) --> This will always remove the last element of the Set.
		}

	}

}
