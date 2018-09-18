package com.training.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String args[]) {
		 // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);
        

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");
    }


}

//Major Differences between ArrayList and Vector:

//Synchronization : Vector is synchronized that means at a time only one thread can access the code while arrayList is not synchronized that means multiple threads can work on arrayList at same time.
//Performance: ArrayList is faster as it is non-synchronized while vector operations give slow performance as they are synchronized(thread-safe). 
//Data Growth: ArrayList and Vector both grow and shrink dynamically to maintain optimal use of storage. But the way they resized is different. ArrayList increments 50% of current array size if number of elements exceeds its capacity while vector increments 100% means doubles the current array size.
//Traversal: Vector can use both Enumeration and Iterator for traversing over elements of vector while ArrayList can only use Iterator for traversing.

//Major Differences between ArrayList and LinkedList:
//Insertions are easy and fast in LinkedList as compared to ArrayList because there is no risk of resizing array and copying content to new array if array gets full which makes
//adding into ArrayList of O(n) in worst case, while adding is O(1) operation in LinkedList in Java. ArrayList also needs to be update its index if you insert something anywhere except at the end of array.
//Removal also better in LinkedList than ArrayList due to same reasons as insertion
//LinkedList has more memory overhead than ArrayList because in ArrayList each index only holds actual object (data) but in case of LinkedList each node holds both data and addressof next and previous node.