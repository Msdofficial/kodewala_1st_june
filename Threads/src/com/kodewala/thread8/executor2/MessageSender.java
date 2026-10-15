package com.kodewala.thread8.executor2;

public class MessageSender {

	String mobileNumber;
	String message;

	public MessageSender(String mobileNumber, String message) {
		super();
		this.mobileNumber = mobileNumber;
		this.message = message;
	}

	public Boolean messageSender(String mobileNumber , String message)
	{
		System.out.println("sending order confirmation to mobile number" +mobileNumber);
		return true;
	}

}
