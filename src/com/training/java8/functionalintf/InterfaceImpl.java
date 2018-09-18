package com.training.java8.functionalintf;

@FunctionalInterface
interface A {

	int add(int a, int b);

	default public void show() {
		System.out.println("Default method in interface....");
	}

}

interface B {

	void sub();

	default public void show() {
		System.out.println("In B");
	}
}

public class InterfaceImpl {

	int num1, num2;

	public InterfaceImpl(int n1, int n2) {
		// TODO Auto-generated constructor stub
		num1 = n1;
		num2 = n2;
	}

	int useInterface(A a) {
		a.show();
		return a.add(num1, num2);

	}

	public static void main(String[] args) {

		InterfaceImpl obj = new InterfaceImpl(23, 55);
		A interfaceA = (int x, int y) -> {
			return x * y;
		};
		// A interfaceA2=()->{System.out.println("sdasd");};
		B interfaceB = () -> System.out.println("Welcome All");
		interfaceA.show();
		// interfaceB.show();
		// obj.show();
		System.out.println("Result: " + obj.useInterface(interfaceA));

	}

}
