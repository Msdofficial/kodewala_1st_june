package com.kodewala.exception.tryy.with.resources;
//try with resource-->try(should be AutoCloseable)-->introduced in java 1.7
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {
	
	public static void main(String[] args) 
	{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.txt"));)
		{
			//condition : Whatever we will write in try with resource should implement java.lang.AutoCloseable
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
//		finally    --> if we forgot to write finally block for DB closer , java introduced 'try with resources'
//		{                                                  which will automatically close the file.
//			// close DB connection 
//		}
	}

}
