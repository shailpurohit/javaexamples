package com.training.java.basic;

public interface Java8Demoable {
	public void count();

	public abstract void print();

	public default void printDefault() {
		System.out.println("Default method implementation");
	}

	public static void printStatic() {
		System.out.println("Static method implementation");
	}
}