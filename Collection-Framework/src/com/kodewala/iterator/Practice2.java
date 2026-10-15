package com.kodewala.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {
	
	public static void main(String[] args) 
	{
	    List<Integer> list = new ArrayList<Integer>();
	    list.add(10);
	    list.add(17);
	    list.add(19);
	    list.add(20);
	    
	    Iterator<Integer> itr = list.iterator();
	    
	    while(itr.hasNext())
	    {
	    	int value = itr.next();
	    	if(value%2 == 0)
	    	{
	    		System.out.println(value);
	    	}
	    }
	    
	}

}
