package com.kodewala.thread3;
//run() return type will always be void and it can not throw Exception
class Task1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i =0 ; i<10 ; i++)
		{
			if(i==5)
			{
				try
				{
					System.out.println("Sleeping....");
					Thread.sleep(5000);
					System.out.println("Sleeping time over.... Woke up ... started work again ");
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Printing : "+i);
		}
		
	}
}


public class Driver2 {
	
	public static void main(String[] args)
	{
		
		 System.out.println("Driver.main()..... START");
		 
		 Task1 task = new Task1();
		 
		 Thread t1 = new Thread(task);
		 t1.start();
		 
		 System.out.println("Driver.main()..... END");
	}

}