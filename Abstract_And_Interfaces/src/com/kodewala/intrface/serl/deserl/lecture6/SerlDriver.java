package com.kodewala.intrface.serl.deserl.lecture6;

// NOTE : If you modify the class , you have to serialize it again otherwise InvalidClassException occurs because 
// every time you serialize , a unique serialization id (Serial version UID ) is generated. if you dont want to get 
// different serial version UID every time you make changes in the code , you can just hard code it.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerlDriver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Account acc = new Account("Masood" , 10000 , "SBI1234" , "Mirganj"); // creating object.
		
		// send acc to network / Write to file system / database
		// We will write object 'acc' to file system
		
		ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("abc.ser"));
		
		// Write the 'acc' object to file(abc.ser) --> Serialization 
		oos.writeObject(acc);
		
		System.out.println("Serialization done..........!!!!");
	}

}
