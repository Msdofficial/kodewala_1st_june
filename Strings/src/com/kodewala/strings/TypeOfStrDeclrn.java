package com.kodewala.strings;

public class TypeOfStrDeclrn 
{
	public static void main(String [] args) 
	{
		String city = "Bangalore";
		String city1 = "Bangalore";
		String city2= city.concat("_India");
		
		System.out.println(city1);
		
		// checking the address of the objects
		
		System.out.println(city==city1);  // new object will not be created in SCP.
		                                 //Both city and city one will point to the same object.
		
		String s1 = "BLR"; // one object will be created in heap
		String s2 = new String("BLR");// first it will check the content of s2 available in SCP or not . Here, it's available 
		                              // so no more BLR will be created and one "BLR" will be created in heap bcz of new keyword.
		
		System.out.println(s1==s2);// address comparison result will not be same bcz one is in SCP and One is in Heap --> diff. address. 
	}
}
