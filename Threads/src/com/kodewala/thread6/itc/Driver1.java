package com.kodewala.thread6.itc;

public class Driver1 {
	
	public static void main(String[] args) 
	{
		Task task = new Task();
		
		Producer producer = new Producer(task);
		Consumer consumer = new Consumer(task);
		
		producer.start();
		consumer.start();
	}

}
