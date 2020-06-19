 package com.threadstudy.miori;

public class HelloWorldThread extends Thread {
	// Thread 상속함으로써 HelloWorldThread는 Thread라 불릴 수 있다.
	
	// Thread 안에 있는 run method 재정의 = override
	@Override
	public void run() {
		//helloWorld 출력
		System.out.println("Hello World Thread");
	}

}
