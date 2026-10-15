package com.amazon.user;

public class LiveViewers {
	
	private String type;
	private String userId;
	private String mobile;
	private String email;
	public static int userCount =0;
	{
		userCount++;
	}
	
	public LiveViewers(String userId , String type) 
	{
		this.userId = userId;
		this.type = type;
	}
	public LiveViewers(String userId) 
	{
		this(userId , "free");
	}
	
	
	
	public static void main(String[] args) 
	{
		LiveViewers LiveViewers = new LiveViewers("dhad-ajbdj", "paid");
		LiveViewers LiveViewers2 = new LiveViewers("dbqd-ajbdj");
		LiveViewers LiveViewers3 = new LiveViewers("dhqe-ajbdj" , "paid");
		LiveViewers LiveViewers4 = new LiveViewers("dkqd-ajbdj");
		System.out.println("Total viewers : "+userCount);
	}
}
