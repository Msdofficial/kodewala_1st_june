package com.kodewala.intrface.after8.lec2;

public class Facebook implements ISocialMedia{

	@Override
	public void selectPlatform() {
		System.out.println("You have selected Facebook as a social media platform.");
		
	}

	@Override
	public void createAccount() {
		System.out.println("Your Account has been created on Facebook.");
	}

	@Override
	public void logIn() {
		System.out.println("You are successfully logged in.");
		
	}

	@Override
	public void uploadProfilePic() {
		System.out.println("Your profile pic is successfully uploaded.");
		
	}
	

	@Override
	public void logOut() {
		System.out.println("You are successfully loggedOut.");
		
	}

	@Override
	public void uploadReels()  // Here we can override the method or use as it is.
	{
		System.out.println("Your facebook reels has been uploaded Successfully");
	}
	
	

}
