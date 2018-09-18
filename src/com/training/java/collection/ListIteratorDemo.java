package com.training.java.collection;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
	public static void main(String args[]) {

		// take a vector to store Integer objects
		Vector<Integer> v = new Vector<Integer>();

		// Adding Elements to Vector
		v.add(10);
		v.add(20);
		v.add(30);

		// Creating a ListIterator
		ListIterator lit = v.listIterator();
		System.out.println("In Forward direction:");

		while (lit.hasNext())
			System.out.print(lit.next() + " ");

		System.out.print("\n\nIn backward direction:\n");
		while (lit.hasPrevious())
			System.out.print(lit.previous() + " ");

	}
}
