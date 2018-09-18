package com.training.java8.streamapi;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {
	public static void main(String[] args) {

		// Method 2
		Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

		Predicate<String> p1 = s -> s.length() > 3;

		Predicate<String> p2 = Predicate.isEqual("two");

		Predicate<String> p3 = Predicate.isEqual("three");

		/*
		 * stream .filter(p1) .forEach(s->System.out.print(" "+s));
		 */

		/*
		 * stream .filter(p2) .forEach(s->System.out.print(" "+s));
		 */

		/*
		 * stream .filter(p2.or(p3)) .forEach(s->System.out.print(" 	"+s));
		 */

		ArrayList<String> list = new ArrayList<>();
		stream.peek(System.out::println).filter(p1.or(p2)).forEach(list::add);// peek(list::add);

		System.out.println("Done");
		System.out.println("Size of List: " + list.size());
		Stream<String> listStream = list.stream();

		listStream.forEach(System.out::println);

	}
}
