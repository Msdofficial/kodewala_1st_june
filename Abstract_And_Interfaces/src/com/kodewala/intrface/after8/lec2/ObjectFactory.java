package com.kodewala.intrface.after8.lec2;

// ROUTER
public class ObjectFactory {
	
	public void processingRequest(ISocialMedia socialMedia)
	{
		socialMedia.selectPlatform();
		socialMedia.createAccount();
		socialMedia.logIn();
		socialMedia.uploadProfilePic();
		socialMedia.uploadReels();
		socialMedia.logOut();
		
	}

}
