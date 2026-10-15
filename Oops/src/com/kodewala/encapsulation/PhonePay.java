package com.kodewala.encapsulation;

public class PhonePay {
      private int balance ;
      private String pin;
      
      public PhonePay(int balance , String pin)
      {
    	  this.balance = balance;
    	  this.pin = pin;
      }     
      public int getBalance() 
      {
    	  return balance;
      }
	  public int deposit(int _balance , String _pin) 
      {
    	  if(_balance > 0 & _pin.equals(pin)) 
    	  {
    		  this.balance = balance + _balance;
    	  }
    	  else 
    	  {
    		  System.out.println("Entered Invalid balance or pin");
    	  }
    	  return balance;
      }
	  public int withdrawl(int amountToWithdraw , String _pin) 
	  {
		  if(amountToWithdraw  <= balance & amountToWithdraw >0 & _pin.equals(pin) ) 
		  {
			 this.balance = balance - amountToWithdraw ;
		  }
		  else 
		  {
			  System.out.println("Entered Invalid balance or pin");
		  }
		  
		  return balance;
	  }
      
}
