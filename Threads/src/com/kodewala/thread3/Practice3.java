package com.kodewala.thread3;

class Task3{

	public synchronized void printNumber()  
	{
		for(int i=0 ; i< 10 ; i++)
		{
			System.out.println(i+ " [" +Thread.currentThread().getName()+ "]");
		}
	}
}

class PrintThread1 extends Thread
{
	Task3 task;
	PrintThread1(Task3 _task)
	{
		this.task = _task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
}


public class Practice3 {
	
	public static void main(String[] args)
	{
		Task3 task = new Task3();
		
		PrintThread1 t1 = new PrintThread1(task);
		t1.setName("Thread-1");
		t1.start();
		
		PrintThread1 t2 = new PrintThread1(task);
		t2.setName("Thread-2");
		t2.start();
	}
}
