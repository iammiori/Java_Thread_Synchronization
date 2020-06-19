package com.threadstudy.stop_flag;


public class App {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread("A");

		t1.start();
		
		Thread.sleep(3000);
		t1.setFlag(true);
		
	}

}
 