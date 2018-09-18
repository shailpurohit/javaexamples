package com.training.java8.stringsnio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> str = Arrays.asList("one", "two", "three", "four", "Seven");
		List<String> st2 = new ArrayList<String>(str);

		boolean b = st2.removeIf(s -> s.length() > 4);

		st2.forEach(System.out::println);

		st2.replaceAll(String::toUpperCase);

		st2.forEach(System.out::println);

	}
}
