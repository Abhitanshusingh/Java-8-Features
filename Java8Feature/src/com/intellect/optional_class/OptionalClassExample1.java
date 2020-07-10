package com.intellect.optional_class;

import java.util.Optional;

public class OptionalClassExample1 {
	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> optional1 = Optional.ofNullable(value1);
		System.out.println(optional1);
		
		//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> optional2 = Optional.of(value2);
		System.out.println(optional2);

		System.err.println(sum(optional1, optional2));
	}

	private static int sum(Optional<Integer> optional1, Optional<Integer> optional2) {

		// Optional.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + optional1.isPresent());
		System.out.println("Second parameter is present: " + optional2.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = optional1.orElse(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = optional2.get();
		return value1 + value2;
	}
}
