package com.kodewala.intrface.after8.lec2;

public class SnapChat implements ISocialMedia{

	@Override
	public void selectPlatform() {
		System.out.println("You have selected SnapChat as a social media platform.");
		
	}

	@Override
	public void createAccount() {
		System.out.println("Your Account has been created on SnapChat.");
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

}
