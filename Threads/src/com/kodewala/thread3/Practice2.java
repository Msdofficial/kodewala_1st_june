package com.kodewala.thread3;

// 2nd way to create thread i.e., using Runnable.
class Order1 implements Runnable
{
	@Override
	public void run()
	{
	    System.out.println("selecting product...."+Thread.currentThread().getName());
	    System.out.println("selecting quantity...."+Thread.currentThread().getName());
	    
	    try {
	    	System.out.println("Sleeping......");
			Thread.sleep(5000);  // Current thread will sleep here for 5 second.
			System.out.println("Woke up ..... started doing work");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    System.out.println("placing order...."+Thread.currentThread().getName());
	}
}

public class Practice2 {
	
	public static void main(String[] args) 
	{
		System.out.println("Practice.main() ..... START");
		
		Order1 o1 = new Order1();
		
		Thread t1 = new Thread(o1);
		t1.setName("Thread1");
		t1.start();
		
//		Thread t2 = new Thread(o1);
//		t2.setName("Thread2");
//		t2.start();
		
		System.out.println("Practice.main() .... END");
	}

}
