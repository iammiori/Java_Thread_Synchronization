package com.threadstudy.concurrency;

public class App {

	public static void main(String[] args) {

		Thread t1 = new CharThread("A");
		Thread t2 = new CharThread("\tB");

		t1.start();
		t2.start();
	}

}
 