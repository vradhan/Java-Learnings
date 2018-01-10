package com.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	
}

class MyRunnable implements Runnable{

	protected static int value; 
	
	protected AtomicInteger atomic = new AtomicInteger();
	@Override
	public void run() {

		Lock lock = new ReentrantLock();
		lock.lock();
		for(int i = 0;i<10;i++){
		System.out.println("value incremented is -- "+value++);
		System.out.println("atomic value is incremented as -- "+atomic.incrementAndGet());
		}
		lock.unlock();
	}
	
}

public class CallableFutureExample {
	
	public static void main(String a[]) throws InterruptedException, ExecutionException{
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<String>> list = new ArrayList<Future<String>>();
		
		Callable<String> callable = new MyCallable();
		for(int i=0; i<20;i++){
			Future<String> future = executor.submit(callable);
			list.add(future);
		}
		
		for(Future<String> fut: list){
			System.out.println(new Date()+"----"+fut.get());
		}
		
		executor.shutdown();
		
		
		ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
		
		singleExecutor.execute(new MyRunnable());
		singleExecutor.execute(new MyRunnable());
		
		singleExecutor.shutdown();
		
	}

}
