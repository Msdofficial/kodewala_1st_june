package com.kodewala.iterator;
import java.util.*;
import java.util.List;

public class Practice1 {
	
	public static void main(String[] args) 
	{
	    List<String> list = new ArrayList<String>();
	    list.add("Masood");
	    list.add("Raza");
	    list.add("Daksh");
	    list.add("Prajwal");
	    
	    Iterator<String> itr = list.iterator();
	    int count =0;
	    
	    while(itr.hasNext())
	    {
	    	itr.next();
	    	count++;
	    }
	    System.out.println(count);
	}

}
