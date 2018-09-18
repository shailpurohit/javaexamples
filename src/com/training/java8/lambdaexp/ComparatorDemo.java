package com.training.java8.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		/*
		 * Comparator<String> comp=new Comparator<String>() { //Anonymous class
		 * 
		 * @Override public int compare(String o1, String o2) { // TODO
		 * Auto-generated method stub return
		 * Integer.compare(o1.length(),o2.length()); } };
		 */

		Comparator<String> comp = (o1, o2) -> Integer.compare(o1.length(), o2.length());

		List<String> l = new ArrayList<String>();
		l.add("****");
		l.add("***");
		l.add("*****");
		l.add("***");
		l.add("**");

		Collections.sort(l, comp);

		for (String s : l)
			System.out.println(s);
		
		// l.forEach(System.out::println);
		
	}
}
