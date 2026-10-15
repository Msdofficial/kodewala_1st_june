package com.kodewala.ecommerce.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	
	private String orderId;
	private String customerId;
	private  List<CartItem> cartItem;
	private double totalAmount;
	private String orderStatus;
	private LocalDateTime orderDate;
	
	public Order()
	{
		
	}
	
	
	
	public Order(String orderId, String customerId, List<CartItem> cartItem, double totalAmount, String orderStatus,
			LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.cartItem = cartItem;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}



	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", cartItem=" + cartItem + ", totalAmount="
				+ totalAmount + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}
	
	
	

}
