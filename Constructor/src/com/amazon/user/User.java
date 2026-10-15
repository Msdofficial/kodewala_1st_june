package com.amazon.user;

public class User 
{
	private String userName;
	private String userId;
	private String mobile;
	private String email;
	
	public User(String user) 
	{
		this("guest_user", user, "9876543210","Msd@123");
		System.out.println("User.User() - 1");
	}
	public User(String userName, String userId,String mobile,String email) 
	{
		System.out.println("User.User() - 2");
		this.userName = userName;
		this.userId= userId;
		this.mobile = mobile;
		this.email= email;
	}
}
