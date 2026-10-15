package com.polymorphism.user.resistration.system;

public class PhoneNumberRegistration extends Registration {
	
	@Override
	public void doRegistration()
	{
		System.out.println("PhoneNumberRegistration.doRegistration()----- phone number and otp based registration");
	}

}
