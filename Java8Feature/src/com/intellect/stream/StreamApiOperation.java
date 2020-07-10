package com.intellect.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiOperation {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Abhitasnhu", "Himanshu", "Shubham", "ab", "hs", "ss", "Aa");
		List<Integer> number = Arrays.asList(3, 3, 4, 5, 6, 7, 5, 4, 3, 2);

		// Storing list data into filtered
		List<String> filtered = name.stream().filter(n -> !n.isEmpty()).collect(Collectors.toList());

		// Printing List using forEach
		filtered.stream().forEach(n -> System.out.println(n));

		// map
		List<Integer> squareList = number.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		squareList.forEach(n -> System.out.println(n));

		// filter
		boolean isPresent = name.stream().filter(s -> s.equals("Abhitanshu")) != null;
		System.out.println("Abhitanshu present or not: " + isPresent);

		// collectors
		String nameFiltered = name.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + nameFiltered);

		// Statistics
		IntSummaryStatistics statistics = number.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number in List : " + statistics.getMax());
		System.out.println("Lowest number in List : " + statistics.getMin());
		System.out.println("Sum of all numbers : " + statistics.getSum());
		System.out.println("Average of all numbers : " + statistics.getAverage());
	}
}
