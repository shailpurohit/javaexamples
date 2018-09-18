package com.training.java8.stringsnio;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringsDemo {

	public static void main(String[] args) {

		/* I am using JAVA */

		StringJoiner sj = new StringJoiner(" , ", "{ ", " }");
		sj.add("One").add(" Two").add("Three");
		String s1 = sj.toString();
		System.out.println(s1);

		// joining the String
		// no prefix n postfix available, use StringJoiner
		String sn = String.join(" ,", "One", "two", "three", "four"); 

		System.out.println(sn);
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

		//java | python | nodejs | ruby
		String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println("Collectors.joining:::" + result);
		
		//Join List<Object> example.
		List<Game> objectList = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String objectListResult = objectList.stream().map(x -> x.getName())
			.collect(Collectors.joining(", ", "{", "}"));
        System.out.println("Collectors.joining with object:::" + objectListResult);

		// Streaming the string using chars() method
		"hey shail".chars().forEach(System.out::println);
	}
}

class Game{
    String name;
    int ranking;

    public Game(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
