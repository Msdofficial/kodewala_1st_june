package com.kodewala.polymorphism;

class Notification{
	public void sendNotification()
	{
		System.out.println("Notification.sendNotification() --------- Parent class");
	}
}

class EmailNotification extends Notification{
	@Override
	public void sendNotification()  
	{
		System.out.println("EmailNotification.sendNotification()---------- child class ");
	}
}

class SmsNotification extends Notification{
	@Override
	public void sendNotification()
	{
		System.out.println("SmsNotification.sendNotification()-------- child class");
	}
}


public class Driver1 {
	public static void main(String[] args) 
	{
		Notification n1 = new Notification();   // Parent class referring parent class object 
		
        //compile time --> Method "sendNotification()" will be checked in parent class i.e., Notification class ,
		// if not present compile time error.
		
		// run time --> calls the sendNotification() from Notification class. 
		n1.sendNotification();
		
		Notification n2 = new EmailNotification();  // Parent class referring child class object (auto up-casting)
		
		//compile time --> Method "sendNotification()" will be checked in parent class,if not present compile time error.
		//run time --> calls the sendNotification() from EmailNotification class.
		n2.sendNotification();
		
		
		Notification n3 = new SmsNotification();   // Parent class referring child class object (auto up-casting)
		
		//compile time --> Method "sendNotification()" will be checked in parent class,if not present compile time error.
		//run time --> calls the sendNotification() from SmsNotification class.
		
		n3.sendNotification();    // which method to call ? --> Decision happens at runtime, hence overriding is runtime poly-morphism.
	}

}
