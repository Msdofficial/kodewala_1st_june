package com.kodewala.exception.tryy.with.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AutoCloseable {
	
	public static void main(String[] args) 
	{
		/*
		 * if i want to write multiple auto closable classes in side try with resources , i can write it with
		 * semicolon
		 */
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));)
		{
	
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
