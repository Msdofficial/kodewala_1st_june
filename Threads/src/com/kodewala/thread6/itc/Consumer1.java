package com.kodewala.thread6.itc;

public class Consumer1 extends Thread {
	
	Task task;
	
	public Consumer1(Task _task)
	{
		this.task = _task;
	}
	
	@Override
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			try {
				Thread.sleep(500);
				task.consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
