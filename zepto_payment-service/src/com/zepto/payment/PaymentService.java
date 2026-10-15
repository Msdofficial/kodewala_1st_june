package com.zepto.payment;

public class PaymentService {
	
	public boolean confirmPayment(String cardNumber , String expiryDate , String cvv) {

	    System.out.println("Processing payment...");
	    System.out.println("Card Number : "+cardNumber);
	    System.out.println("Expiry Date : "+expiryDate);

	    // Simple validation
	    
	    if(cardNumber == null || cardNumber.length() != 16)
	    {
	    	System.out.println("Invalid Card Number");
	    	return false;
	    }
	    
	    if(expiryDate == null || cvv == null || cvv.length() != 3 )
	    {
	    	System.out.println("Invalid payment details");
	    	return false;
	    }
	    
	    
	    System.out.println("Payment confirmed successfully!");
	    return true;
	}

}
