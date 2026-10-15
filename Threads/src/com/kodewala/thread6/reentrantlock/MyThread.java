package com.kodewala.thread6.reentrantlock;

public class MyThread extends Thread {
	
	Task task;
	
	public MyThread(Task _task)
	{
		this.task =_task;
	}
	
	@Override
	public void run()
	{
		task.doSomething();
	}

}
