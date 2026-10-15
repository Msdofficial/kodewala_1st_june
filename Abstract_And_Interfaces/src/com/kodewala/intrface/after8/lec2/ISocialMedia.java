package com.kodewala.intrface.after8.lec2;

public interface ISocialMedia {
	
	// All the methods are about 'What' the methods will do in child class , 
	// 'How' it will be done will be decided by the child classes 
	
	public abstract void selectPlatform();   
	public void createAccount();
	void logIn();
	abstract void uploadProfilePic();   // all the methods in interface are " public abstract " by default.
	void logOut(); 
	
	
	
	// Reels introduced after 10 years , so after java 8 we can make a default method to achieve backward compatibility.(Code fatna nhi chahiye)
	// Backward compatibility ??? --> If we make any change in the existing working system, it should work for user with old version and new version 
	// This method can be used by any class as per requirement and the other classes can function as usual without implementing it.
	public default void uploadReels()
	{
		System.out.println("You can upload reels."); 
	}

}
