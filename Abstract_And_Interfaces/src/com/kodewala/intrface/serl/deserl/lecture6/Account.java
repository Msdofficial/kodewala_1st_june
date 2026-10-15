package com.kodewala.intrface.serl.deserl.lecture6;

import java.io.Serializable;

public class Account implements Serializable {
	
	public static final long serialVersionUID = 1L ; // Hard coding serialVersionUID .
	private String name;
	private transient int balance;  // if you don't want to make it visible or you want to hide it , you can make it 
	                                // transient , hence it will not be visible once deserialize .
	private  transient String ifscCode;
	private String location;
	
	
	public Account(String name, int balance, String ifscCode, String location) {
		super();
		this.name = name;
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public String getLocation() {
		return location;
	}
	
	

}
