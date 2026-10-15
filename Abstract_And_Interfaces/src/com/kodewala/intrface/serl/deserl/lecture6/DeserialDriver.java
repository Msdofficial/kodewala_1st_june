package com.kodewala.intrface.serl.deserl.lecture6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserialDriver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ser"));
		
		
		Account account = (Account) ois.readObject();
		
		System.out.println("De-Serialization done ");
		
		System.out.println("Account details:\n Name --> "+ account.getName()+"\n balance --> " +account.getBalance()+ "\n IFSC Code --> "+account.getIfscCode()+ "\n Location --> "+account.getLocation());
	}

}
