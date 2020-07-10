package com.intellect.optional_class;

import java.util.Optional;

public class OptionalClassExample2 {
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.empty();
		System.out.println(optionalString);
		
		//Using if else statement
		String book = null;
		if (book != null)
			System.out.println(book.toUpperCase());
		else {
			book = "Java 8";
			System.out.println(book.toUpperCase());
		}
		
		//Same thing using Optional
		String book1 = null;
		optionalString = Optional.ofNullable(book1);
		System.out.println(optionalString.orElse("java 8").toUpperCase());
	}
}
