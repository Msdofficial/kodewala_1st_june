package com.amazon.user;

public class SIB_IIB 
{
	private String userName ;
	private String userId;
	private String mobile;
	private String email;
	
	static 
	{
		System.out.println("static IB called.");
	}
	{
		System.out.println("instace IB called.");
	}
	public SIB_IIB(String _user) 
	{
		this("guest_user", _user, "9876543", "Msd@123");
		System.out.println(" costructor - 1");
	}
	public SIB_IIB(String userName ,  String userId,String mobile, String email ) 
	{
		System.out.println("costructor -2 ");
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.email = email;
	}
	public static void main(String[] args)
	{
		System.out.println("main() called... ");
		SIB_IIB _user = new SIB_IIB("if-kjd-jndj-jnwd");
	}
}
