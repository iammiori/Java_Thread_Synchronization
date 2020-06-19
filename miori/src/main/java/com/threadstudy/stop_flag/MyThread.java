package com.threadstudy.stop_flag;

public class MyThread extends Thread {
	
	private String msg;
	private boolean flag = false;
	
	public MyThread(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		while (true) {
			if (flag==true) {
				break;
			}
			System.out.println(msg);
		}
	}
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}


}
