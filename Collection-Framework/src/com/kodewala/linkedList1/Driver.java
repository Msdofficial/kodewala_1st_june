package com.kodewala.linkedList1;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) 
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		 
	    linkedList.add("BLR");
	    linkedList.add("DEL");
	    linkedList.add("KOL");
	    linkedList.add("MUM");
	    linkedList.add("KOL");
	    
		System.out.println(linkedList);
		
		// Time complexity will be O(N) 
		System.out.println(linkedList.get(0));
		
		// when we add element the traversing will take O(N) + actual adding task will take O(1) --> O(N)
		linkedList.add(3,"CHE");
		System.out.println(linkedList);
		
	}

}
