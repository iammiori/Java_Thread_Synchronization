package com.threadstudy.interrupt;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread("A");
		t1.start();
		
		Thread.sleep(2000);
		
		t1.interrupt();

	}

}
