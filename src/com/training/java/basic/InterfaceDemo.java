package com.training.java.basic;

/*
 * As this file contains public class. Then the name of this file should be InterfaceDemo.java
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		InterfaceClass interfaceClassObj = new InterfaceClass();
		// Call method
		interfaceClassObj.printCounter();
	}

}

class InterfaceClass implements Demoable {

	@Override
	public void printCounter() {
		System.out.println("Your counter value:" + count);
	}
}