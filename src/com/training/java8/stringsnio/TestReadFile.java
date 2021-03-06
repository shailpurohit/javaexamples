package com.training.java8.stringsnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

	public static void main(String args[]) {

		String fileName = "abc.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream
			.filter(s->s.contains("Java"))
			.map(s->s.toUpperCase())
			.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
