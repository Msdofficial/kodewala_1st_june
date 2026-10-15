package com.kodewala.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// LIST ITERATOR --> How and Why to Use
public class Practice5 {

	public static void main(String[] args) {
		List<String> employee = new LinkedList<String>();

		employee.add("Masood");
		employee.add("Raza");
		employee.add("Daksh");
		employee.add("Arya");
		employee.add("Prajwal");

		ListIterator<String> itr = employee.listIterator();

		while (itr.hasNext()) {
			String names = itr.next();
			System.out.println(names);
			if (names.equals("Arya")) 
			{
				employee.remove("Arya");
			}
		}

	}

}
