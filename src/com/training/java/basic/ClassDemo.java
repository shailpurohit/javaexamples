package com.training.java.basic;

/*
 * As this file contains public class. Then the name of this file should be ClassDemo.java
 */
public class ClassDemo {

	public int i; // This is Non Static variable
	
	static {
		System.out.println("This is static block");
	}
	
	ClassDemo() {
		System.out.println("This is constructor");
	}

	void method() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		System.out.println("This is main method calling");
		//Create Object
		ClassDemo testObj = new ClassDemo();
		//Call method
		testObj.method();
	}
	
/**
 * A class can have only public and default access
 * The public class needs to be in the same name java file
 * A single java file can contain more than one non-public class but can have only one public class
 * A public class can be seen by all classes from all packages
 * A class with default access can be seen only by classes within the same package
 * A Java file with no public class has no naming restriction
 * The Class can also have final, abstract and strictfp non-access modifiers
 * An Abstract Class cannot be instantiated
 * A Final Class cannot be subclassed
 * A Class cannot be both final and abstract
 * Class visibility can be seen in 3 parameter
 * If a Class can extend another Class?
 * If a Class can create an instance of another Class?
 * If a Class can access methods and variable of another Class?	
 */
	
}
