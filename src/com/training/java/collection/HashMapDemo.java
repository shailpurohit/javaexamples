package com.training.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// Creation of HashMap
		Map<String, String> Geeks = new HashMap<>();

		// Adding values to HashMap as ("keys", "values")
		Geeks.put("Language", "Java");
		Geeks.put("Platform", "Geeks For geeks");
		Geeks.put("Code", "HashMap");
		Geeks.put("Learn", "More");

		System.out.println("Testing .isEmpty() method");

		// Checks whether the HashMap is empty or not
		// Not empty so printing the values
		if (!Geeks.isEmpty()) {
			System.out.println("HashMap Geeks is notempty");

			// Accessing the contents of HashMap through Keys
			System.out.println("GEEKS : " + Geeks.get("Language"));
			System.out.println("GEEKS : " + Geeks.get("Platform"));
			System.out.println("GEEKS : " + Geeks.get("Code"));
			System.out.println("GEEKS : " + Geeks.get("Learn"));

			// size() method prints the size of HashMap.
			System.out.println("Size Of HashMap : " + Geeks.size());
		}
		
		
		// 3  containsKey() method is to check the presence
        //    of a particluar key
        // Since 'Code' key present here, the condition is true
        if (Geeks.containsKey("Code"))
            System.out.println("Testing .containsKey : " +
                                           Geeks.get("Code"));

        // 4 keySet() method returns all the keys in HashMap
        Set<String> Geekskeys = Geeks.keySet();
        System.out.println("Initial keys  : " + Geekskeys);


        // 5  values() method return all the values in HashMap
        Collection<String> Geeksvalues = Geeks.values();
        System.out.println("Initial values : " + Geeksvalues);

        // Adding new set of key-value
        Geeks.put("Search", "JavaArticle");

        // Again using .keySet() and .values() methods
        System.out.println("New Keys : " + Geekskeys);
        System.out.println("New Values: " + Geeksvalues);
		

	}

}

//Hashmap vs Hashtable
//HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
//HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value
//HashMap is generally preferred over HashTable if thread synchronization is not needed

//Fail Fast Vs Fail Safe Iterators In Java
//Fail-Fast iterators doesn’t allow modifications of a collection while iterating over it.
//These iterators throw ConcurrentModificationException if a collection is modified while iterating over it.
//They use original collection to traverse over the elements of the collection.
//These iterators don’t require extra memory.
//Fail fast - Ex : Iterators returned by ArrayList, Vector, HashMap.
//Fail safe - Ex : Iterator returned by ConcurrentHashMap.


//There are various factors that can be considered when selecting an appropriate collection for a particular problem. These factors are:

//Ordering – Some sort of ordering in the elements. For example, sorted order, insertion order or no specific ordering.
//Duplicates – May or may not want to allow duplicate elements in a collection.
//Thread Safe – Ensure the safety of the elements in collections in case there are multiple threads accessing it.
//Key-Value pair – Store in key-value pairs.
//Random Access – Instant retrieval of an element.
//Upper Bounds – To limit the maximum number of elements a collection can hold.
//There are also other factors like the priority, delay etc..


//A collection is a data structure in which Objects are stored.
//Objects can be Added, Deleted and can be traversed in Collection.
//There are 4 type of basic Collection
//List: Ordered, Duplicates are allowed, Indexed
//Sets: May or may not Be Ordered. Duplicates are not allowed.
//Maps: Duplicate keys are not allowed.
//Queue: Ordered by FIFO or priority.
//ArrayList: Fast Iteration & Fast Random Access.
//Vector: Synchronized Method.
//LinkedList: Good for implementing Stack and Queue.
//HashSet: Fast Access, No Duplicates, No Ordering.
//LinkedHashSet: No Duplicates, Iterates by insertion order.
//TreeSet: No Duplicates, Iterates in sorted order.


