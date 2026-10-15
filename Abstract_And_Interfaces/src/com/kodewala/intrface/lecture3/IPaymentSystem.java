package com.kodewala.intrface.lecture3;

public interface IPaymentSystem {
	
	void pay();
	void settle();
	
	public default void checkBalance()
	{
		connectToDB();  // instead of writing 20 or more lines of the DB connection code, we can reuse private method.
		System.out.println("IPaymentSystem.checkBalance()");
	}
	
	public static int calculateTxnFees(int amount , int txnPerc)
	{
		connectToDB(); // instead of writing 20 or more lines of the DB connection code, we can reuse private method.
		int txnFee = amount * txnPerc/100;
		return txnFee;
	}
	
	public static int calculateConvFee(int amount , int txnPerc , String type)
	{
		connectToDB();  // instead of writing 20 or more lines of the DB connection code, we can reuse private method.
		int txnFee = amount * txnPerc/100;
		return txnFee;
	}
	
	private static void connectToDB()
	{
		// 20 lines of codes 
	}
}
