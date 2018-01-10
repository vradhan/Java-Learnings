package com.datastructures;

import java.util.List;

public class BlockingQueue {
	
	public List<Object> queue;
	public int limit;
	
	BlockingQueue(int limit){
		this.limit=limit;
	}
	
	public synchronized void enqueue(Object item) throws InterruptedException{
		if(this.limit==this.queue.size()){
			wait();
		}
		if(this.queue.size()==0){
			notifyAll();
		}
		this.queue.add(item);
		
		
	}
	
	public synchronized void dequeue() throws InterruptedException{
		if(this.queue.size()==0){
			wait();
		}
		if(this.limit==this.queue.size()){
			notifyAll();
		}
		
		this.queue.remove(0);
	}

}
