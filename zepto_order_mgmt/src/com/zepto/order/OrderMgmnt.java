package com.zepto.order;

import com.zepto.payment.PaymentService;

public class OrderMgmnt {

	public static void main(String[] args) {
		
		OrderMgmnt orderMgmnt = new OrderMgmnt();
		
		Order order = new Order();

		order.setOrderStatus("PLACED");
		order.setTotalAmount(450.50);
		order.setPaymentStatus("PENDING");
		order.setDeliveryAddress("Bangalore, Karnataka");

		orderMgmnt.placeOrder(order);
	}
	
	public void placeOrder(Order order)
	{
		//take the order
		
		  System.out.println("========== ORDER RECEIVED ==========");
		    System.out.println("Order ID: " + order.getOrderId());
		    System.out.println("Customer ID: " + order.getCustomerId());
		    System.out.println("Delivery Address: " + order.getDeliveryAddress());
		    System.out.println("Total Quantity: " + order.getTotalQuantity());
		    System.out.println("Total Amount: ₹" + order.getTotalAmount());
		    System.out.println("Payment Status: " + order.getPaymentStatus());
		    System.out.println("Order Status: " + order.getOrderStatus());
		    System.out.println("Order Date: " + order.getOrderDate());
		    System.out.println("Expected Delivery: " + order.getExpectedDeliveryTime());
		    System.out.println("====================================");
		    System.out.println("Your Zepto order has been received successfully!");
		
		//confirm the payment
		    
		 PaymentService paymentService = new PaymentService();
		 
		 boolean paymentStatus = paymentService.confirmPayment("1234567887654321", "123456", "123");
		 
		 if(paymentStatus)
		 {
			 System.out.println("payment successfull");
		 }
		 else 
		 {
			 System.out.println("Payment failed");
		 }
		 
	}

}
