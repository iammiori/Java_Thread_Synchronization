package com.threadstudy.runnable1;

public class App {

	public static void main(String[] args) {
		
		Runnable r1 = new MyRunnable("A");
		Runnable r2 = new MyRunnable("\tB");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
		
		// 간략하게
		/*
		new Thread(new MyRunnable("A")).start();
		new Thread(new MyRunnable("\tB")).start();
		*/
	}

}
