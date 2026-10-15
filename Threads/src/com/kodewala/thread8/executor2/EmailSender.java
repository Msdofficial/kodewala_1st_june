package com.kodewala.thread8.executor2;

public class EmailSender {
	
	String email;
	String body;
	
	
	public EmailSender(String _email, String _body) {
		super();
		this.email = _email;
		this.body = _body;
	}
	
	public boolean sendEmail(String _email , String _body) 
	{
		System.out.println("Sending Email to " +email+ "["+Thread.currentThread().getName()+"]");
		
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	

}
