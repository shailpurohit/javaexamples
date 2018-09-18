package com.training.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapfilterreduce {
	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Sham", 23, "Camp"), new Person("Ram", 36, "Sangli"),
				new Person("John", 34, ""), new Person("Chelsea", 34, "US"), new Person("Alice", 45, "SanFransico"),
				new Person("Brain", 28, "Cambridge"));
		Stream<Person> Pstream = person.stream(); // Pstream.

		// select ranges
		person.stream().skip(1).limit(5).filter(p -> p.getAge() > 35).forEach(System.out::println); // triggers the computation
		
		
		Stream<String> names = Stream.of("a", "d", "b", "123", "c");
		List<String> naturalSorted = names.sorted().collect(Collectors.toList());
		System.out.println("Sorted List::"+ naturalSorted);
		
		//Prior to Java 8
		List<String> features = Arrays.asList("JDK5","JDK6", "JDK7", "JDK8");
		for (String feature: features) {
			System.out.println(feature);
		}
		//In Java8
		features.forEach(e->System.out.println(e));
		
		// Count the number of string which starts with 'j'
		List<String> strList = Arrays.asList("java", "", "j2ee", "", "spring", "hibernate", "webservices");
		
		long count = strList.stream().filter(x -> x.startsWith("j")).count();
		System.out.println("List has string which startsWith 'j':::" + String.valueOf(count));
	}

}
