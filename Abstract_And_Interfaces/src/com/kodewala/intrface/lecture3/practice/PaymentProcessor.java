package com.kodewala.intrface.lecture3.practice;

public interface PaymentProcessor {

	void processPayment(double amount);
	
	public default void generatePaymentReciept()
	{
		System.out.println("Payment reciept generated succeessfully.");
	}
	public static boolean isValidAmount(double amount)
	{
		if(amount > 0 ) return true;
		logInvalidAmount(amount);
		return false;
	}
	
	private static void logInvalidAmount(double amount)
	{
		System.out.println("Invalid payment amount : "+amount);
	}
}
