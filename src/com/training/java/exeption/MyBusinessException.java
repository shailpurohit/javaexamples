package com.training.java.exeption;

public class MyBusinessException extends Exception {

	// parametrized constructor
	MyBusinessException(Exception e) {
		System.out.println("Test/./" + e.getClass());
		if (e instanceof ArrayIndexOutOfBoundsException) {
			System.out.println("Yooo...");
		}
	}

}
