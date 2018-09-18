package com.training.java.basic;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		// Uncommenting the following line will cause compiler error as the 
        // line tries to create an instance of abstract class.
        //Base b = new Base();
		
		Base b = new Derived();
	    b.fun();
	}

}

abstract class Base {
	abstract void fun();
}

class Derived extends Base {
	void fun() {
		System.out.println("Derived fun() called");
	}
}



// An abstract class with constructor
/*abstract class Base {
	Base() {
		System.out.println("Base Constructor Called");
	}

	abstract void fun();
}

class Derived extends Base {
	Derived() {
		System.out.println("Derived Constructor Called");
	}

	void fun() {
		System.out.println("Derived fun() called");
	}
}

class Main {
	public static void main(String args[]) {
		Derived d = new Derived();
	}
}*/

// An abstract class without any abstract method
/*abstract class Base {
	void fun() {
		System.out.println("Base fun() called");
	}
}

class Derived extends Base {
}

class Main {
	public static void main(String args[]) {
		Derived d = new Derived();
		d.fun();
	}
}*/

// An abstract class with a final method
/*abstract class Base {
	final void fun() {
		System.out.println("Derived fun() called");
	}
}

class Derived extends Base {
}

class Main {
	public static void main(String args[]) {
		Base b = new Derived();
		b.fun();
	}
}
*/
