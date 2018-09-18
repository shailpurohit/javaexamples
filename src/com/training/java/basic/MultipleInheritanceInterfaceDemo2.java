package com.training.java.basic;

interface InterfaceA {
	void show();
}

interface InterfaceB {
	void show();
}

interface InterfaceC {
	void show();
}

// Implementation class code
class MultipleInheritanceInterfaceDemo2 implements InterfaceA, InterfaceB, InterfaceC {
	
	@Override
	public void show() {
		System.out.println("show implementation of concrete class");
	}

	public static void main(String[] args) {
		InterfaceA objA = new MultipleInheritanceInterfaceDemo2();
		InterfaceB objB = new MultipleInheritanceInterfaceDemo2();
		InterfaceC objC = new MultipleInheritanceInterfaceDemo2();
		
		//all the method calls below are going to same concrete implementation
		objA.show();
		objB.show();
		objC.show();
	}
}