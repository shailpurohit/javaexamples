package com.training.java.thread;

public class ExtendThreadDemo extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ExtendThreadDemo t1 = new ExtendThreadDemo();
		ExtendThreadDemo t2 = new ExtendThreadDemo();

		t1.start();
		t2.start();
	}

}
