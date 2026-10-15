package com.kodewala.stringbuffer;

public class ToDoList {
	public static void main(String[] args) 
	{
		StringBuffer list = new StringBuffer();
		System.out.println("TO-Do-List: \n");
		list.append("1. Buy groceries \n");
		list.append("2. Finish homework \n");
		list.append("3. Call the plumber \n");
		
		System.out.println(list);
		System.out.println("Updated List: \n");
		
		int start = list.indexOf("Finish homework");
		int end = start + "Finish homework".length();
		
		list.delete(start, end);
		list.insert(start, "Finish homework - Updated ");
		
		System.out.println(list);	
	}

}
