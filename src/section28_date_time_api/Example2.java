package section28_date_time_api;

import java.util.Date;

/**
 * File Name: Example2.java
 * Entity: Example2
 * Package: section28_date_time_api
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 * 📅 Working With java.util.Date (Legacy API - Pre Java 8)
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 *
 * ✅ The Date class is based on the number of milliseconds passed since Jan 1, 1970 (Epoch time).
 * ❌ Deprecated methods still exist in this class but should be avoided in modern applications.
 * 🔄 Java 8 introduced java.time package which should be preferred for date-time handling.
 */

public class Example2 {
	public static void main(String[] args) {
		
		// 🔹 Create current date and time using default constructor
		Date date = new Date();  // Internally uses System.currentTimeMillis()
		System.out.println("Current Date (Default Constructor) : " + date);
		
		// 🔹 Create date using explicit milliseconds (System time)
		Date date1 = new Date(System.currentTimeMillis());
		System.out.println("Current Date (From Milliseconds)  : " + date1);
		
		// ⚠️ Create date from string (DEPRECATED - Avoid in new code)
		Date date2 = new Date("1/1/1970");
		System.out.println("Date From String Constructor      : " + date2);
		
		// 🕒 Extract individual components (⚠️ Deprecated methods)
		System.out.println("Milliseconds Since Epoch : " + date.getTime()); // Still useful!
		
		// 👇 All below methods are DEPRECATED, but shown here for legacy understanding
		System.out.println("Seconds : " + date.getSeconds());
		System.out.println("Minutes : " + date.getMinutes());
		System.out.println("Hours   : " + date.getHours());
		System.out.println("Month   : " + date.getMonth()); // 0 = Jan, 11 = Dec
		System.out.println("Day     : " + date.getDay());   // Day of week (0 = Sunday)
		System.out.println("Year    : " + date.getYear());  // Years since 1900
		System.out.println("Full Year: " + (date.getYear() + 1900)); // Convert to actual year
		
		/*
		 * 📝 Developer Notes:
		 * ----------------------
		 * - While Date is still part of Java, it is considered outdated.
		 * - Many of its methods are deprecated due to thread-safety and design issues.
		 * - Prefer `java.time.LocalDate`, `LocalDateTime`, `Instant`, etc. for new applications.
		 * - Only use Date if you're working with older libraries or legacy systems.
		 */
	}
}