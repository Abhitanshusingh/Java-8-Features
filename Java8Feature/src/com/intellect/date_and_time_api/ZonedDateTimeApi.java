package com.intellect.date_and_time_api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApi {
	public static void main(String args[]) {
		testZonedDateTime();
	}

	private static void testZonedDateTime() {
		// Fetching available Zone Id
		for (String fetchZone : ZoneId.getAvailableZoneIds())
			System.out.println(fetchZone);

		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2020-07-03T10:15:30+05:30[Indian/Chagos]");
		System.out.println("Date1: " + date1);

		ZoneId id = ZoneId.of("Indian/Chagos");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Indian/Chagos"));
		System.out.println("Current Date and Time: " + localDateTime);
	}
}
