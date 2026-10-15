package com.kodewala.thread6.itc;

public class Task1 {

	int data;
	boolean isAvailable = false;

	// producer

	public synchronized void produce(int _data) throws InterruptedException {
		while (isAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting for consumer");
			wait();
		}

		this.data = _data;
		System.out.println("data is produced.....");

		isAvailable = true;
		System.out.println("Waiting for consumer to consume the data : " + data);
		notify(); // notifying the consumer that data has been produced.
	}

	public synchronized void consumer() throws InterruptedException {
		while (!isAvailable)
		{
			System.out.println("[" + Thread.currentThread().getName() + "] waiting for producer");
			wait();		
		}
		
		System.out.println("Consuming the data : "+data);
		
		isAvailable = false;
		System.out.println("notifying the producer to produce more data");
		notify();
	}

}
