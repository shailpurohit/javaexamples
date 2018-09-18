package com.training.java8.functionalintf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		System.out.println("Languages which starts with J :");
		Predicate<String> p1 = (str) -> ((String) str).startsWith("J");
		filter(languages, p1);
		
		Predicate<String> p2 = (str) -> ((String) str).endsWith("a");
		System.out.println("Languages which ends with a ");
		filter(languages, p2);
		
		Predicate<String> p3 = p1.and(p2);
		System.out.println("Languages starts with J and which ends with a ");
		filter(languages, p3);
		
		System.out.println("Print all languages :");
		filter(languages, (str) -> true);
		
		System.out.println("Print no language : ");
		filter(languages, (str) -> false);
		
		System.out.println("Print language whose length greater than 4:");
		filter(languages, (str) -> ((String) str).length() > 4);
	}

	public static void filter(List<String> names, Predicate<String> condition) {
		for (String name : names) {
			if (condition.test(name))
				System.out.println(name + " ");
		}

	}

}
