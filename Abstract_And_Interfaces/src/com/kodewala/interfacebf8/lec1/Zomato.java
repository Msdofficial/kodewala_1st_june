package com.kodewala.interfacebf8.lec1;

public class Zomato implements FoodDelivery  {

	@Override
	public void createAccount() {
		System.out.println("Account has been created on Zomaaaatooo....");
		
	}

	@Override
	public void logIn() {
		System.out.println("You are logged in ..., Welcome to Zomato.");
		
	}

	@Override
	public void placeOrder() {
		System.out.println("Your order has been placed on swiggy.");
		
	}

	@Override
	public void trackOrder() {
		System.out.println("You can track your order status here.");
		
	}

	@Override
	public void deliveryStatus() {
		System.out.println("Your order has been delivered by our Zomato delivery partner.");
		
	}

}
