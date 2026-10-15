package com.kodewala.hashset1;

import java.util.HashSet;

public class Driver {
	public static void main(String [] args) 
	{
		HashSet<String> city = new HashSet<String>(); // initial default capacity will be 16 . 
		
		city.add("BLR");  // now , we will see how it works internally to allocate the bucket for that element.
		
		// first it will calculate the hashCode for that element.
		int hash = "BLR".hashCode();
		System.out.println(hash); // 65864
		
		// second step is --> calculate spreadHash
		int spreadHash = hash ^ (hash >>> 16);   // 
		
		// Third step is the formula i.e., [65864 & (N-1)]
		int bucket = spreadHash & 15 ;
		
		System.out.println(bucket);  // bucket number --> 9 
		
		// Hence "BLR" will go to bucket 9 and check , if any object present in bucket 9 or not , if not then it will be added in node of a linkedList.
		// In this case , KOL is already present in 9th bucket (Collision), then it will be compared with "KOL".equals("BLR") which will return false 
		// After that BLR will be added in that bucket by adding a node in the existing linkedList
		city.add("CHE");
		city.add("KOL");
		city.add("BBR");
		city.add("HYD");
		city.add("BLR");
		city.add("DEL");
		
		System.out.println(city);  // this will print only unique element.
	}
}
