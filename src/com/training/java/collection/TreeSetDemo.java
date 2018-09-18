package com.training.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();

		// Elements are added using add() method
		ts1.add("B");
		ts1.add("A");
		ts1.add("C");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);

	}

}


//HashSet vs TreeSet vs LinkedHashSet
//Duplicates : All three implements Set interface means they are not allowed to store duplicates
//Thread safety : HashSet, TreeSet and LinkedHashSet are not thread-safe, if you use them in multi-threading environment where at least one Thread  modifies Set you need to externally synchronize them.
//Iterator returned by TreeSet, LinkedHashSet and HashSet are fail-fast Iterator.
//Performance and Speed : First difference between them comes in terms of  speed.  HashSet is fastest, LinkedHashSet is second on performance or almost similar to HashSet but TreeSet is bit slower because of sorting operation it needs to perform on each insertion. TreeSet provides guaranteed O(log(n)) time for common operations like add, remove and contains, while HashSet and LinkedHashSet offer constant time performance e.g. O(1) for add, contains and remove given hash function uniformly distribute elements in bucket.
//Ordering : HashSet does not maintain any order while LinkedHashSet maintains insertion order of elements much like List interface and TreeSet maintains sorting order or elements.
//Both HashSet and LinkedHashSet allows null but TreeSet doesn't allow null 

