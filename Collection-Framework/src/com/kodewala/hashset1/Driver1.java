package com.kodewala.hashset1;

import java.util.HashSet;

public class Driver1 {
	public static void main(String[] args)
	{
		HashSet<String> product = new HashSet<String>();
		
		product.add("iPhone17");
		product.add("samsungs26");
		product.add("lg32");
		product.add("mac-pro324");
		
		System.out.println("iPhone17".hashCode());     // hashCode  -->  -619339925
		System.out.println("mac-pro324".hashCode());   // hashCode -->   1868068390
		
		    //            Situation                       	 Collision?
			//	        Same hashCode()	      -->         Hash-code collision
			//   Different hashCode(), same bucket	-->    Bucket collision
		
		// here hashCode is different but it falls in same bucket so it is bucket collision.
		
		// internal working of HashSet to store a new element.
		
		int hash = "iPhone17".hashCode();           // Calculating hashCode .
		int spreadHash = hash ^ (hash >>> 16);        // Spreading helps distribute objects more evenly across buckets and reduces collisions.
		int bucketNumber = spreadHash & 15 ;          // calculating Bucket Number .
		
		System.out.println("Bucket number is : "+bucketNumber);
		
	}
}
