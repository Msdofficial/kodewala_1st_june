package com.kodewala.interfacebf8.lec1;

public class Driver {
	
	public static void main(String[] args)
	{
		FoodDelivery delivery = new Swiggy();
		
		delivery.createAccount();
		delivery.logIn();
		delivery.placeOrder();
		delivery.trackOrder();
		delivery.deliveryStatus();
		
		System.out.println("=============================================");
		
		
		FoodDelivery delivery1 = new Zomato();
		
		delivery1.createAccount();
		delivery1.logIn();
		delivery1.placeOrder();
		delivery1.trackOrder();
		delivery1.deliveryStatus();
		
		System.out.println("=============================================");
	}

}
