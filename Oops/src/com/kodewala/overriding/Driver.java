package com.kodewala.overriding;


class Customer{
	private void showDetails()   // This method can not be overridden because it is not visible outside the class.
	{
		System.out.println("Customer.showDetails()");
	}
	
	public void calculatePrice()    // this can be , because it is public hence, visible outside the class.
	{
		System.out.println("Customer.calculatePrice()");
	}
}

class GoldCustomer extends Customer{
	
	@Override     // we use to write @Override to make sure that the overriding method is is actually Overrided or not . 
	public void calculatePrice()
	{
		System.out.println("GoldCustomer.calculatePrice()");       
	}
}

public class Driver {

	public static void main(String[] args) {
		

	}

}
