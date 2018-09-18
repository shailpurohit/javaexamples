package com.training.java.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// Creating an empty HashSet
		HashSet<String> set = new HashSet<String>();

		// Use add() method to add elements into the Set
		set.add("Welcome");
		set.add("To");
		set.add("Geeks");
		set.add("4");
		set.add("Geeks");

		// Displaying the HashSet
		System.out.println("HashSet: " + set);

		// Using isEmpty() to verify for the emptiness
		System.out.println("The set is empty? " + set.isEmpty());

		// Does the set contain "Geeks"
		System.out.println("Does the set contain 'Geeks'?" + set.contains("Geeks"));

		// Getting the size of the set
		System.out.println("The size of the set is " + set.size());

		// Removing "To" from the set
		set.remove("To");

		// Displaying the HashSet
		System.out.println("HashSet: " + set);

		// Clearing the HashSet using clear() method
		set.clear();

		// Displaying the final Set after clearing;
		System.out.println("The final set: " + set);

	}

}
