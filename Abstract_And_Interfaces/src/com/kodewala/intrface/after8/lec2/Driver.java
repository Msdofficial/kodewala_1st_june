package com.kodewala.intrface.after8.lec2;

// CLIENT 
public class Driver {
	
	public static void main(String[] args)
	{
		ObjectFactory objFact = new ObjectFactory();
		
		ISocialMedia socialMedia = new Facebook();
		
		objFact.processingRequest(socialMedia);
		
	}

}
