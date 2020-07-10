package com.intellect.date_and_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterApi {
	public static void main(String args[]) {
		testAdjusters();
	}

	private static void testAdjusters() {
		// Get the current date
		LocalDate date = LocalDate.now();
		System.out.println("Current date: " + date);

		// get the next tuesday
		LocalDate nextTuesday = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);

		// get the second saturday of next month
		LocalDate firstInYear = LocalDate.of(date.getYear(), date.getMonth(), 1);
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on : " + secondSaturday);
	}
}
