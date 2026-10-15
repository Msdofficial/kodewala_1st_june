package com.kodewala.encapsulation;

public class PhonePayUser {
	
	public static void main(String[] args) {
		PhonePay phonePay = new PhonePay(1000, "Msd@123");
		phonePay.deposit(-3000, "Msd@123");
		System.out.println(phonePay.getBalance());
		phonePay.withdrawl(2000, "Msd@123");
		System.out.println(phonePay.getBalance());
		
	//	phonePay.balance = 200000;  This can not change the balance directly , because balance is encapsulated.
		
	}

}
