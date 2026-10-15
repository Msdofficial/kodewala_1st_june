package com.kodewala.intrface.lecture3;

public class SMSNotification implements Notification{

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS notification.");
		
	}

	@Override
	public String notificationType() {
		return "SMS";
	}

}
