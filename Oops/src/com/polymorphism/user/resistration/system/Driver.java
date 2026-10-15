package com.polymorphism.user.resistration.system;

public class Driver {
	
	public static void main(String[] args) 
	{
		RegistrationProcessor processor = new RegistrationProcessor();
		
		Registration registration = new PANRegistration(); // auto upcasting
		
		processor.processingRegistration(registration);
	}

}
