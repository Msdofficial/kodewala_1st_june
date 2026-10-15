package com.kodewala.thread6.itc;

public class Task {
	
	int data;
	boolean isDataAvailable = false;
	
	// Producer
	
	public synchronized void producer(int _data) throws InterruptedException
	{
		while(isDataAvailable)
		{
			System.out.println("[" +Thread.currentThread().getName()+ "] is waiting....");
			wait();
		}
		// produced the data
		
		this.data = _data;
		System.out.println("produced the data " +data );
		
		isDataAvailable = true;
		System.out.println("producer notifying the consumer");
		notify();  // notify the consumer so that consumer can consume the data.
	}
	
	// consumer 
	
	public synchronized void consumer() throws InterruptedException
	{
		while(!isDataAvailable)
		{
			System.out.println("[" +Thread.currentThread().getName()+ "] is waiting....");
			wait();
		}
		
		// consumed the data
		
		System.out.println("consuming the data " +data );
		
		isDataAvailable = false;
		System.out.println("consumer notifying the producer");
		notify();  // notify the producer so that producer can generate/produce more data.
		
	}

}
