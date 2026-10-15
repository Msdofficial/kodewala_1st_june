package com.kodewala.stringbuffer;

public class CapacityTest {
	public static void main(String[] args)
	{
		StringBuffer sb  = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("You are welcome to KodeWala BTM Bangalore.....");     
		System.out.println(sb.capacity());
		
	}

}
