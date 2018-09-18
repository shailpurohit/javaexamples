package com.training.java.basic;

public class MultipleInheritanceDemo extends Parent1 {
	public static void main(String args[]) {
		MultipleInheritanceDemo multipleInheritanceDemo = new MultipleInheritanceDemo();
		multipleInheritanceDemo.fun();
	}
}

// A Grand parent class in diamond
abstract class GrandParent {
	void fun() {
	}
}

// First Parent class
class Parent1 extends GrandParent {
	void fun() {
		System.out.println("Parent1");
	}
}

// Second Parent Class
class Parent2 extends GrandParent {
	void fun() {
		System.out.println("Parent2");
	}
}


//A simple Java program to demonstrate how diamond
//problem is handled in case of default methods

/*interface GPI
{
 // default method
 default void show()
 {
     System.out.println("Default GPI");
 }
}

interface PI1 extends GPI { }

interface PI2 extends GPI { }

//Implementation class code
class TestClass implements PI1, PI2
{
 public static void main(String args[])
 {
     TestClass d = new TestClass();
     d.show();
 }
}*/
