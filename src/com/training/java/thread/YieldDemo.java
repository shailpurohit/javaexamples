package com.training.java.thread;

public class YieldDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i = 0; i < 5; i++) {
			// Control passes to child thread
			Thread.yield();

			// After execution of child Thread
			// main thread takes over
			System.out.println(Thread.currentThread().getName() + " in control");
		}

	}

}

// MyThread extending Thread
class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

//yield(): Suppose there are three threads t1, t2, and t3. Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state. 
//Completion time for thread t1 is 5 hour and completion time for t2 is 5 minutes. Since t1 will complete its execution after 5 hours, t2 has to wait for 5 hours to just finish 5 minutes job.
//In such scenarios where one thread is taking too much time to complete its execution, we need a way to prevent execution of a thread in between if something important is pending. 
//yeild() helps us in doing so


//Output may vary in machine to machine but chances of execution of yield() thread first is higher than the other thread because main thread is always pausing its execution and giving chance to child thread(with same priority).

//Once a thread has executed yield method and there are many threads with same priority is waiting for processor, then we can't specify which thread will get execution chance first.
//The thread which executes the yield method will enter in the Runnable state from Running state.
//Once a thread pauses its execution, we can't specify when it will get chance again it depends on thread scheduler.
//Underlying platform must provide support for preemptive scheduling if we are using yield method.