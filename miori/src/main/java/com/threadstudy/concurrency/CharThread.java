package com.threadstudy.concurrency;

public class CharThread extends Thread {

	private String msg;

	public CharThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(msg);
		}
	}

}
