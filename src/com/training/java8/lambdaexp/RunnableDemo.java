package com.training.java8.lambdaexp;

public class RunnableDemo {

	public static void main(String[] args) {
		/*
		 * Runnable r=new Runnable() { //anonymous class
		 * 	@Override public void run() { // TODO Auto-generated method stub
		 * 	for(int i=0;i<3;i++) 
		 * 		System.out.println("Welcome user: "+i); 
		 * 	} 
		 * };
		 */

		Runnable r1 = () -> System.out.println("Welcome::::" + Thread.currentThread());

		Runnable r = () -> System.out.println("Executing thread:::: " + Thread.currentThread());

		Thread t = new Thread(r);
		Thread t2 = new Thread(r1);
		t.start();
		t2.start();
	}
}


//Fewer Lines of Code
//Sequential and Parallel Execution Support by passing behavior in methods
	//Prior to Java 8, processing the elements of any collection could be done by obtaining an iterator from the collection and then iterating over 
	//the elements and then processing each element. If the requirement is to process the elements in parallel, it would be done by the client code. 
	//With the introduction of Stream API in Java 8, functions can be passed to collection methods and now it is the responsibility of collection 
	//to process the elements either in a sequential or parallel manner.
//Higher Efficiency (Utilizing Multicore CPU’s)
	//Using Stream API’s and lambda expression we can achieve higher efficiency (parallel execution) in case of bulk operations on collections. 
	//Also, the lambda expressions can help in achieving internal iteration of collections rather than external iteration 