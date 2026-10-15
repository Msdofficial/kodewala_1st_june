package com.kodewala.thread4;

class Task{
	
	public synchronized void printNumbers()
	{
		for(int i=0 ; i< 10 ;i++)
		{
			System.out.println(i+ " [" +Thread.currentThread().getName()+ "]");
		}
	}
}

class PrinterThread extends Thread{
	
	Task task;
	PrinterThread(Task _task)
	{
		this.task = _task;
	}
	
	public void run()
	{
		task.printNumbers();
	}
}


public class Driver1 {
	
	public static void main(String[] args)
	{
		Task task1 = new Task();  // Object Lock count =1
		PrinterThread t1 = new PrinterThread(task1);
		t1.start();
		
		
		Task task2 = new Task(); // Object Lock count =1
		PrinterThread t2 = new PrinterThread(task2);
		t2.start();
		
        // Note: Since there are two object here and each object has 1-1 lock , the task execution 
	    // will be parallel and we will see mixed result in-spite-of using synchronized keyword.
	}

}
