package com.intellect.date_and_time_api;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;

public class PeriodAndDuration {
	public static void main(String[] args) {
		testPeriod();
		testDuration();
	}

	private static void testPeriod() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// Add 1 month to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date2);

		// Add 4 month to the current date
		LocalDate date3 = date1.plus(5, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date3);

		Period period1 = Period.between(date2, date1);
		System.out.println("Period: " + period1);

		Period period = Period.between(date3, date2);
		System.out.println("Period: " + period);
	}

	private static void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration: " + duration);
	}
}
