package com.threadstudy.queuethread;

import java.util.concurrent.Semaphore;

public class App {
	
	public static MyQueue<Integer> queue = new MyQueue<Integer>();
	public static Semaphore sem;
	
	public static void main(String[] args) throws InterruptedException {
		
		sem = new Semaphore(1);
		
		EnqueueRunnable r1 = new EnqueueRunnable();
		Thread t1 = new Thread(r1);
		
		t1.start();
		new Thread(new EnqueueRunnable()).start();
		new Thread(new EnqueueRunnable()).start();
		new Thread(new EnqueueRunnable()).start();
		
		Thread.sleep(5000);
		System.out.println(queue.size());
	}

}
