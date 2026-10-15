package com.kodewala.hashset1;

class Employee{
	// We will now create Employee class object in main method because here is a default no argument 
	// constructor is present .
}

public class HashCode {
	public static void main(String[] args)
	{
		String s1 = "BLR";
		String s2 = "BLR";
		
		System.out.println("HashCode of s1 is: "+s1.hashCode()+" , HashCode of s2 is: "+s2.hashCode());
		// Here we can see that if two objects are equal then their hashCode must be same
		// and we can prove it using .equals() method
		System.out.println(s1.equals(s2)); //  output will be true.
		
		Employee o1 = new Employee();  // But , here o1 and o2 are different object , hence they are not equal
		Employee o2 = new Employee();  // so , when we apply .equals() method , it will return false
		
		System.out.println(o1.equals(o2));  // output will be false 
		
	}

}
