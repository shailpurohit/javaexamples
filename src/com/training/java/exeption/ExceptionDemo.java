package com.training.java.exeption;

/*
 * As this file contains public class. Then the name of this file should be TestClass2.java
 */
public class ExceptionDemo {
	
	public void testExcepton() throws MyBusinessException {
		try {
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of
						// size 5
		} catch (Exception e) {
			
			throw new MyBusinessException(e);
		}

		
	}

	public static void main(String[] args) throws MyBusinessException {

		
		ExceptionDemo exDemoObj = new ExceptionDemo();
		
		
		
			exDemoObj.testExcepton();
		
		
		
		/*try {
			String a = null; // null value
			System.out.println(a.charAt(0));
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		} finally {
			System.out.println("print statement from finally");
		}
		
		try {
			int a = 30, b = 0;
			int c = a / b; // cannot divide by zero
			System.out.println("Result = " + c);
		} catch (NumberFormatException ex) {
			System.out.println("Number Format Exception " + ex);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
		
		try {
			fun();
		} catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}*/
		
	}
	
	static void fun() throws IllegalAccessException {
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

}


//checked & unchecked exception are two type of Exception.
//A checked exception is those exceptions which are the subtype of Exception class but excluding classes which extends Runtime exception.
//A subtype of Error and Runtime Exceptions comes under unchecked Exception.
//Finally block will always be invoked in all condition.
//System.exit() is the only way when finally block will not get executed coz, in that case, JVM will shut down.
//Custom Exception can also be created by extending Exception class.
//Catch block should be ordered in the form of most specific to most general. Otherwise, the compiler will complain about unreachable code.

//Finally block always executes once the control from the try block exits irrespective of whether an exception is thrown or not.
//Finally block is not executed,
//	If JVM exits while try/catch block code is being executed
//	If System.exit() is executed before control reaches finally block
//	If the thread executing try/catch code is interrupted or killed
//Finally block prevents any resource leaks by closing any that might have been opened.
