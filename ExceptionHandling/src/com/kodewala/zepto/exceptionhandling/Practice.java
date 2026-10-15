package com.kodewala.zepto.exceptionhandling;  // interview question

public class Practice {
	
	public static void main(String[] args)
	{
		Practice p1 = new Practice();
		
		System.out.println(p1.calculatePercentage(100, 10));
	}

	
	@SuppressWarnings("finally")
	public int calculatePercentage(int principle , int percent)
	{
		try
		{
			return (principle * percent) / 100 ;
		}
		finally
		{
			return 2*(principle * percent) / 100 ;  // finally block will always override the value
		}
	}
}
