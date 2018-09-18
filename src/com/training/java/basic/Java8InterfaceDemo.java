package com.training.java.basic;

/*
 * As this file contains public class. Then the name of this file should be TestClass2.java
 */
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		InterfaceJava8Class interfaceJava8ClassObj = new InterfaceJava8Class();
		// Call method
		interfaceJava8ClassObj.count();
		interfaceJava8ClassObj.print();
		interfaceJava8ClassObj.printDefault();
		Java8Demoable.printStatic();
	}

}

class InterfaceJava8Class implements Java8Demoable {

	@Override
	public void count() {
		System.out.println("Count method implemented");
	}

	@Override
	public void print() {
		System.out.println("Print method implemented");
	}

}

/**
 * An interface is 100% abstract class(Implicitly). After Java 8 it doesn’t hold true.
 * Interfaces can be implemented by any class from any inheritance tree.
 * All methods in Interfaces are abstract. (In Java 8 either abstract/ static / default)
 * An interface can have constants, these constants are public, static and final(Implicitly).
 * Interface methods are implicitly public & abstract. (Before Java 8)
 * Interface methods can have a body if static or default modifier is used against the method.(Java 8)
 * A class implementing an interface can also be an abstract class.
 * An abstract class which is implementing an interface need not implement all abstract method.
 * A class can Implement more than one Interface.
 * Interfaces can not extend a class or implement an Interface.
 * An interface can extend another Interface.
 * A non-abstract class which is implementing an Interface needs to follow some rules.
 * This class needs to provide the concrete implementation of all abstract method.
 * All rules of Overriding needs to be followed.
 * It must maintain the exact signature of a method.
 */