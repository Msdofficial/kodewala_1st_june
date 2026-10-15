package com.polymorphism.user.resistration.system;

// Router --> this will route according to the actual requirement.
public class RegistrationProcessor {
	
	public void processingRegistration(Registration registration)
	{
		registration.doRegistration(); // Polymorphism.
	}
}
