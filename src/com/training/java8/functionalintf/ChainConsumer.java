package com.training.java8.functionalintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {

	private ChainConsumer() {
	}

	public static void main(String[] args) {
		List<String> l = Arrays.asList("one", "two", "three", "four", "five");
		List<String> l2 = new ArrayList<>();
		l2.add("Welcome");

		Consumer<String> c1 = (s) -> {
			System.out.println(s);
		};
		Consumer<String> c2 = (i) -> l2.add(i);

		// l.forEach(c1);
		l.forEach(c1.andThen(c2));
		l2.forEach(c1);
		/*
		 * System.out.println("Display list 2.."); l2.forEach(c1);
		 */

	}

}
