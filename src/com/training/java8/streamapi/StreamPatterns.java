package com.training.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPatterns {
	public static void main(String[] args) {
		// Method 1
		List<Person> person = Arrays.asList(new Person("Sham", 23, "Camp"), new Person("Ram", 34, "Kalyaninagar"),
				new Person("John", 34, "East Street"));

		Stream<Person> stream = person.stream(); // 1st pattern ...Map

		Stream.empty(); // 2nd pattern returns empty stream

		Stream.of("One");// singleton stream
		Stream.of("One", "two", "three");

		stream.filter(p -> p.getAge() > 30) // filter
				.forEach(System.out::println);

		Stream.Builder<String> sb = Stream.builder();
		sb.add("One").add("Two").add("Three");

		sb.accept("Four");

		Stream<String> st = sb.build();
		st.forEach(System.out::println);

		/*
		 * IntStream ints="hello".chars(); System.out.println(ints);
		 */

	}
}
