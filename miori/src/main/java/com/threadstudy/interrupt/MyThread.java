package com.threadstudy.interrupt;

public class MyThread extends Thread {
	
	private String msg;
	
	public MyThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		while (true) {
			if(Thread.interrupted()) {
				return;
			}
			
			/*
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
			*/
			System.out.println(msg);
			System.out.println(Thread.interrupted());
		}
	}

}
