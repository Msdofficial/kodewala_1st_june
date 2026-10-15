package com.user.sbi;

public class SBIUser {
	
	private String name ;
	private String userId;
	private String pass;
	private int balance;
	// Non-parametrised constructor
	SBIUser(){
		System.out.println("I am inside SBIUser()");
	}
	//parametrised constructor
	SBIUser(String _name , String _userId , String _pass , int _balance){
		System.out.println("SBIUser(String _name , String _userId , String _pass , int _balance)");
		String name = _name;
		String userId = _userId;
		String pass = _pass;
		int balance = _balance;
	}
	public static void main(String [] args) {
		System.out.println("SBIUser.main() START");
		
		SBIUser sbiUser= new SBIUser("Masood" , "Masood123" , "Masood@1234" , 10000);
		
		
		System.out.println("SBIUser.main() END");
	}
}
