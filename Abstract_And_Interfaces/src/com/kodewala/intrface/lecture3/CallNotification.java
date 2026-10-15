package com.kodewala.intrface.lecture3;

public class CallNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Sending call notification.");
		
	}

	@Override
	public String notificationType() {
		return "call";
	}

}
