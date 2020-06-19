package com.threadstudy.dining_philosophers;

public class App {
	
	public static void main(String args[]) {
		
		//테이블
		DiningTable table = new DiningTable();
		
		//철학자
		Philosopher p0 = new Philosopher(0, table);
		Thread t0 = new Thread(p0);
		t0.start();
		
		new Thread(new Philosopher(1,table)).start();
		new Thread(new Philosopher(2,table)).start();
		new Thread(new Philosopher(3,table)).start();
		new Thread(new Philosopher(4,table)).start();
		
	}

}
