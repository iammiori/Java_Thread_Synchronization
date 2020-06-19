package com.threadstudy.dining_philosophers;

public class Philosopher implements Runnable{
	
	private DiningTable table;	
	private int pid; //철학자는 id를 가짐
	private String indentation;
	
	public Philosopher(int pid, DiningTable table) {
		// TODO Auto-generated constructor stub
		this.table = table;
		this.pid = pid;
		
		// 잘 보이도록
		indentation="";
		for(int i =0;i<pid;i++) {
			indentation += "\t\t";
		}
	}
	
	@Override
	public void run() {
		while(true) {
			if (pid%2==0) {
			System.out.println(indentation+"왼쪽 포크집기시도");
			table.getLeftFork(pid);
			System.out.println(indentation+"오른쪽 포크집기시도");
			table.getRightFork(pid);
			}else {
				System.out.println(indentation+"오른쪽 포크집기시도");
				table.getRightFork(pid);
				System.out.println(indentation+"왼쪽 포크집기시도");
				table.getLeftFork(pid);
			}
			System.out.println(indentation+"포크집기 성공");
			System.out.println(indentation+"식사");
			System.out.println(indentation+"왼쪽 포크놓기시도");
			table.returnLeftFork(pid);
			System.out.println(indentation+"오른쪽 포크놓기시도");
			table.returnRightFork(pid);
			System.out.println(indentation+"생각");
			}
		
	}

}
