package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample implements Runnable {

	private int lotSize = 10;
	private int cars = 0;

	private void addCars() {
		try{
		Lock lock = new ReentrantLock(); 
		lock.lock();
		System.out.println("once more");
		lock.lock();
			try {
				if (lotSize <= 10) {
					cars = cars + 1;
					lotSize = lotSize - 1;
					System.out.println("after entry: size of cars is: " + cars);
				} else {
					throw new ArrayStoreException();
				}
			} catch (ArrayStoreException e) {
				System.out.println("the size has exceeded");
			}
		lock.unlock();
		lock.unlock();
		}
		/*catch(InterruptedException ie){
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		}*/
		catch (Exception e){
			e.printStackTrace();
		}

	}

	private void exitCars() {
		synchronized (this) {
			try {

				if (cars >= 0 && lotSize <= 10)
					cars = cars - 1;
				lotSize = lotSize + 1;
				System.out.println("after exit: size of cars is: " + cars);

			} catch (Exception e) {

			}

		}
	}

	public void run() {
		Lock lock = new ReentrantLock();
		try{
		lock.lock();
			addCars();
		lock.unlock();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		int nbThreads = Thread.getAllStackTraces().keySet().size();
		System.out.println("the number of threads is:" + nbThreads);
		if (cars >= 10) {
			exitCars();
		}
	}

	public static void main(String a[]) {
		ThreadExample te = new ThreadExample();
		Thread t1 = new Thread(te);
		t1.start();
	}

}
