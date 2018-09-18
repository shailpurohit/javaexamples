package com.training.java8.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// JAVA 7
		Calendar c = Calendar.getInstance();

		c.set(2018, 1, 2);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 7);

		System.out.println(c.getTime());
		/** LocalDate ***/

		LocalDate localDate = LocalDate.now();
		LocalDate.of(2015, 02, 20);

		LocalDate.parse("2015-02-20");
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();

		int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();

		/** LocalTime ***/

		LocalTime cal = LocalTime.now();
		System.out.println(cal);
		cal.plusHours(3);
		System.out.println(cal);

		System.out.println(ZonedDateTime.now());
		System.out.println(LocalDate.of(2014, Month.FEBRUARY, 15));

	}
}

//Thread Safety – The Date and Calendar classes are not thread safe, leaving developers to deal with the headache of hard to debug concurrency issues 
//and to write additional code to handle thread safety. On the contrary the new Date and Time APIs introduced in Java 8 are immutable and thread safe, thus taking that concurrency headache away from developers.
//APIs Design and Ease of Understanding – The Date and Calendar APIs are poorly designed with inadequate methods to perform day-to-day operations. 
//The new Date/Time APIs is ISO centric and follows consistent domain models for date, time, duration and periods.
//ZonedDate and Time – Developers had to write additional logic to handle timezone logic with the old APIs, whereas with the new APIs, handling of timezone can be done with Local and ZonedDate/Time APIs.