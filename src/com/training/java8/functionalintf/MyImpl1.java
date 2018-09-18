package com.training.java8.functionalintf;

public class MyImpl1 {
	public static void main(String[] args) {

		MyInterface m1 = (num1, num2) -> {
			return num1 + num2;
		};

		MyInterface m2 = (num1, num2) -> {
			return num1 - num2;
		};
		System.out.println("Result:  " + m1.sum(23, 33));
		
		System.out.println("Result for m2:  " + m2.sum(23, 33));
	}

}
