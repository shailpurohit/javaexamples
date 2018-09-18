package com.training.java.collection;

public class GenericsDemo {

	public static void main(String[] args) {
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
	}

}

// A Simple Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T> {
	// An object of type T is declared
	T obj;
	
	// constructor
	Test(T obj) {
		this.obj = obj;
	} 

	public T getObject() {
		return this.obj;
	}
}