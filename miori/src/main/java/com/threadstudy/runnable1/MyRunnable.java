package com.threadstudy.runnable1;

public class MyRunnable implements Runnable {

	private String msg;

	public MyRunnable(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(msg);
		}
	}

}
