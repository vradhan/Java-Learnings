package threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsIncrement implements Runnable{
	
	private AtomicInteger atomicValue = new AtomicInteger();
	private static int value = 0;
	
	public void incrementValue() throws InterruptedException{
		Lock lock = new ReentrantLock();
		lock.lock();
		try{
			while(value<20){
				System.out.println("value is --"+value++);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			incrementValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static void main(String a[]) throws InterruptedException{
			ThreadsIncrement ti = new ThreadsIncrement();
			Thread t1 = new Thread(ti);
			Thread t2 = new Thread(ti);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		}
	

}
