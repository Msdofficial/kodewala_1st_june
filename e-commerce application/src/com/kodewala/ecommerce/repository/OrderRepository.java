package com.kodewala.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.kodewala.ecommerce.exception.OrderNotFoundException;
import com.kodewala.ecommerce.model.Order;

public class OrderRepository {

	static List<Order> orderDB = new ArrayList<Order>();

	public void saveplacedOrder(Order orderId) {
		orderDB.add(orderId);
	}

	public void findOrderByOrderId(String orderId) throws OrderNotFoundException {
		List<Order> result = orderDB.stream().filter(order -> order.getOrderId().equals(orderId))
				.collect(Collectors.toList());

		if (result.isEmpty()) {
			throw new OrderNotFoundException("order is not available with orderId : " + orderId);
		}
		
		System.out.println(result);
	}

	public void findAllOrder() throws OrderNotFoundException{
		
		if (orderDB.isEmpty()) {
			throw new OrderNotFoundException("no order available");
		}

		for (Order order : orderDB) {
			System.out.println(order);
		}

	}

}
