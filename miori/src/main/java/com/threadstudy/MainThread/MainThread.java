package com.threadstudy.MainThread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getId());
		System.out.println(mainThread.getState());
		System.out.println(mainThread.getPriority());

	}

}
