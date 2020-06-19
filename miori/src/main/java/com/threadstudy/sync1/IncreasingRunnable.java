package com.threadstudy.sync1;

public class IncreasingRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i =0;i<10000;i++) {
			try {
				
				
			App.sem.acquire();
			// critical section 시작
			App.val += 1;
			
			// critical section 종료
			App.sem.release();
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
