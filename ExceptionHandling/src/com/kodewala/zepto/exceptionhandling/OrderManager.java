package com.kodewala.zepto.exceptionhandling;

class Order{
	
	public String placeOrder(String productName , int quantity) throws Exception
	{
		if(quantity <0)
		{
			throw new Exception("invalid quantity");
		}
		
		return "order placed";
	}
	
	
}
public class OrderManager {
		public static void main(String[] args) 
		{
			Order o1 = new Order();
			
			try 
			{
				o1.placeOrder("iphone", 1);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
}
