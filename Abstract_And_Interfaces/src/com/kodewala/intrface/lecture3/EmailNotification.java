package com.kodewala.intrface.lecture3;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Sending Email Notification.");
		
	}

	@Override
	public String notificationType() {
		return "Email";
	}

}
