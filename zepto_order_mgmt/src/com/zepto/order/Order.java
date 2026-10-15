package com.zepto.order;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String orderId;
    private String customerId;
    private String deliveryAddress;
    private List<String> productIds;
    private int totalQuantity;
    private double totalAmount;
    private String paymentStatus;
    private String orderStatus;
    private LocalDateTime orderDate;
    private LocalDateTime expectedDeliveryTime;
    
    
	public Order() {
		
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


	public String getDeliveryAddress() {
		return deliveryAddress;
	}


	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}


	public List<String> getProductIds() {
		return productIds;
	}


	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}


	public int getTotalQuantity() {
		return totalQuantity;
	}


	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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


	public LocalDateTime getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}


	public void setExpectedDeliveryTime(LocalDateTime expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}


	
	
    

}
