package com.threadstudy.queuethread;

public class EnqueueRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			try {
				App.sem.acquire();
				// cs in
				App.queue.add(i);

				App.sem.release();
				// cs out
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
