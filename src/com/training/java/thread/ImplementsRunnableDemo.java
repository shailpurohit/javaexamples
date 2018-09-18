package com.training.java.thread;

public class ImplementsRunnableDemo implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		ImplementsRunnableDemo t1 = new ImplementsRunnableDemo();
		Thread r1 = new Thread(t1);
		ImplementsRunnableDemo t2 = new ImplementsRunnableDemo();
		Thread r2 = new Thread(t2);

		r1.start();
		r2.start();
	}
}
