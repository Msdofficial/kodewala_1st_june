package com.kodewala.thread3;

// 2nd way to create thread i.e., using Runnable.
class Order implements Runnable
{
	@Override
	public void run()
	{
	    System.out.println("selecting product...."+Thread.currentThread().getName());
	    System.out.println("selecting quantity...."+Thread.currentThread().getName());
	    System.out.println("placing order...."+Thread.currentThread().getName());
	}
}

public class Practice1 {
	
	public static void main(String[] args) 
	{
		System.out.println("Practice.main() ..... START");
		
		Order o1 = new Order();
		
		Thread t1 = new Thread(o1);
		t1.setName("Thread1");
		t1.start();
		
		Thread t2 = new Thread(o1);
		t2.setName("Thread2");
		t2.start();
		
		System.out.println("Practice.main() .... END");
	}

}
