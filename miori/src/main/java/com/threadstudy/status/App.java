package com.threadstudy.status;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = new MyRunnable("Hello");
		Thread t1 = new Thread(r1);
		
		System.out.println(t1.getName()); //기본적으로 설정된 이름 출력
		t1.setName("Hello World");
		System.out.println(t1.getName()); //setName 설정된 이름 출력
		System.out.println(t1.getId()); //id 출력
		System.out.println(t1.getState()); //state 출력
		System.out.println(t1.getPriority()); //기본적으로 설정된 우선순위 (=5) 출력
		t1.setPriority(10);
		System.out.println(t1.getPriority()); //기본적으로 설정된 우선순위 출력
		
		t1.start();
		System.out.println(t1.getState()); //상태 출력 Runnable
		Thread.sleep(1000); //잠깐 멈추게 함
		
		
		System.out.println(t1.getState()); //상태 출력
		
		
		
		
		
		
	}

}
