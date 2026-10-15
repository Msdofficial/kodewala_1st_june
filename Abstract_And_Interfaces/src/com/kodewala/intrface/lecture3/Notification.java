package com.kodewala.intrface.lecture3;

public interface Notification {
	
	void sendNotification();   // method implementation 
	
	public String notificationType();
	
	public default String sendEmergencyAlert() // Here, method must be default. allowed after java 7.
	{
		return "EMERGENCY ALERT" ;	
	}
	
	public static boolean isValidRecipient(String notificationType , String recipient)
	{
		return true;
	}
	
	private static String evacuate(String input) // allowed after java 8 to reduce code redundancy
	{
		if(input == null) return "";
		return input.trim();
	}

}
