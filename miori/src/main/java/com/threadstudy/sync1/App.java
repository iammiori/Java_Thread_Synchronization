  package com.threadstudy.sync1;

import java.util.concurrent.Semaphore;

public class App {
	
	//공유변수
	public static int val=0;
	//세마포어 자체도 공유자원
	public static Semaphore sem;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		sem = new Semaphore(1); // 최대 1개의 thread가 임계구역에 들어갈 수 있다.
		// 1개 짜리 Semaphore == Mutex
		
		//runnalbe을 instance화
		IncreasingRunnable r1 = new IncreasingRunnable();
		IncreasingRunnable r2 = new IncreasingRunnable();
		//Thread
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		
		t1.start();
		t2.start();
		new Thread(new IncreasingRunnable()).start();
		new Thread(new IncreasingRunnable()).start();
		
		Thread.sleep(3000);
		System.out.println(val);
		

	}

}
