package com.intellect.date_and_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeApi {
	public static void main(String[] args) {
		testLocalDateTime();
	}

	private static void testLocalDateTime() {
		// Get current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date1: " + date1);

		Month month = currentTime.getMonth();
		int year = currentTime.getYear();
		int day = currentTime.getDayOfMonth();
		int hour = currentTime.getHour();
		int min = currentTime.getMinute();
		int sec = currentTime.getSecond();
		System.out.println("Month: " + month + " Year: " + year + " Day: " + day + " Hour: " + hour + " Min: " + min
				+ " Sec: " + sec);

		LocalDateTime date2 = currentTime.withDayOfMonth(04).withYear(1996);
		System.out.println("Date2:" + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(1996, Month.APRIL, 04);
		System.out.println("Date3: " + date3);

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(06, 15);
		System.out.println("Date4: " + date4);

		// parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("Date5: " + date5);

	}
}
