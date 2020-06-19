package com.threadstudy.status;

public class MyRunnable implements Runnable{
	
	private String msg;
	
	public MyRunnable(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println(msg);
		System.out.println(msg);
		System.out.println(msg);
		System.out.println(msg);
	}

}
