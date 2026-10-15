package com.kodewala.thread9.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() ->
		{
				System.out.println(Thread.currentThread().getName());
				return 20;
		});
		
		System.out.println(completableFuture.get());
				
	}

}
