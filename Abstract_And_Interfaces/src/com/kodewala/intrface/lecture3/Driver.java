package com.kodewala.intrface.lecture3;

public class Driver {
	
	public static void main(String[] args)
	{
		Notification n1 = new EmailNotification();
		
		n1.sendNotification();
		n1.notificationType();
		n1.sendEmergencyAlert();
		
	}

}
