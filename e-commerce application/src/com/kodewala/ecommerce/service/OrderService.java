package com.kodewala.ecommerce.service;

import com.kodewala.ecommerce.model.Order;
import com.kodewala.ecommerce.repository.OrderRepository;

public class OrderService {
	
	OrderRepository orderRepository = new OrderRepository();
	
	public void placeOrder(Order orderId)
	{
		orderRepository.saveplacedOrder(orderId);
		System.out.println("Product successfully added in the cart");
	}
	
	public void viewOrderByOrderId(String orderId)
	{
		orderRepository.findOrderByOrderId(orderId);
	}
	
	public void viewAllOrder()
	{
		orderRepository.findAllOrder();
	}
}
