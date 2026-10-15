package com.kodewala.thread1;
/*
 * Steps to make custom thread:
 * 1. Create a class which extends Thread
 * 2. implement / override run method
 * 3. Write the code inside run method 
 * 4. Create the thread object and start it.
 */
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Custom : this code is executed by: ["+Thread.currentThread().getName()+"]thread");
		System.out.println("This is custom thread's method");
		
	}
}
// We can not predict the order of execution of threads i.e., which thread will get executed first.


public class Driver {
	
	public static void main(String[] args)
	{
		System.out.println("Main method start");
		System.out.println("This code is executed by: ["+Thread.currentThread().getName()+ "]thread");
		System.out.println("Hello World....");
		
		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.start();
		
		System.out.println("Main method Ends.");
		
	}

}
