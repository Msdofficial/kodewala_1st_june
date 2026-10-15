package com.kodewala.thread7.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {

	int taskId;

	public MyThread(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("MyThread.run().....task is " + taskId + " : [" + Thread.currentThread().getName() + "]");
	}

}

public class Driver {

	public static void main(String[] args) {
		// We are going to use executor service.
		ExecutorService executorService = Executors.newFixedThreadPool(5); // pool of 5 threads

		// executing 10 task
		for (int i = 0; i < 10; i++) {
			MyThread task = new MyThread(i);

			executorService.execute(task);
		}

		executorService.shutdown();
	}

}
