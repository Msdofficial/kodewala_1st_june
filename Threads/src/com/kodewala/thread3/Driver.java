package com.kodewala.thread3;
/*
 * There are two ways to create thread ,one is using 'Thread' and another is using 'Runnable' .
 * BEST WAY TO CREATE is using 'Runnable', because we can extend or implement more class or interface as per requirement
 * which will bring flexibility.
 */
class Task implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Task.run()");
		
	}
}


public class Driver {
	
	public static void main(String[] args)
	{
		
		 System.out.println("Driver.main()..... START");
		 
		 Task task = new Task();
		 
		 Thread t1 = new Thread(task);
		 t1.start();
		 
		 System.out.println("Driver.main()..... END");
	}

}
