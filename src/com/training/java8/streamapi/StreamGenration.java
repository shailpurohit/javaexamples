package com.training.java8.streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenration {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);

		// method 1
		Stream<Integer> strint = list.stream();

		strint.forEach(System.out::println);

		// method 2
		Stream<String> str = Stream.of("one");
		str.forEach(System.out::println);

		// method 3
		Stream<String> str1 = Stream.generate(() -> "two");// generates values
		str1.limit(4).forEach(System.out::println); // limit it to 5

		// method 4
		Stream<String> str2 = Stream.iterate("+", p -> p + "-");// iterates values
		str2.limit(4).forEach(System.out::println); // limit
		
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
		streamIterated.forEach(System.out::println); // limit
	}
	//Prior to Java8
	int sum(List<Integer> list) {
		Iterator<Integer> inIterator = list.iterator();
		int sum = 0;
		while (inIterator.hasNext()) {
			int number = inIterator.next();
			if (number > 5) {
				sum += number;
			}
		}
		return sum;
	}
	//In Java8
	int sumJava8(List<Integer> list) { 
		return list.stream().filter(i->i>5).mapToInt(i->i).sum();
	}
}



//Prior to JDK 8, Collections could only be managed through iterators with the use of for, for-each or while loops. 
//It means that the computer is instructed to execute the algorithm steps.
	//We need to express how the iteration will take place, this requires an external iteration as the client program to handle the traversal.
	//The program is sequential; there is no way to do it in parallel.
	//The code is verbose



//Java 8 introduces Stream API to circumvent the above-mentioned shortcomings. 
//It also allows us to leverage the other changes, e.g., lambdaexpression, method reference, functional interface and internal iteration introduced via forEach () method.
