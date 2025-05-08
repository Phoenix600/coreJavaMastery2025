package section28_date_time_api;

import java.util.*;

/**
 * File Name: Example1.java
 * Entity: Example1
 * Package: section28_date_time_api
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
 *   🕒 How Java handles Date and Time using System.currentTimeMillis()
 * ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
 *
 * ✅ Java uses `System.currentTimeMillis()` to get the time elapsed
 *    since 1st January 1970 UTC (called Epoch Time).
 * ✅ It returns a long value representing time in milliseconds.
 * ✅ We can convert it to seconds, minutes, hours, days, years manually.
 * ✅ Prior to Java 8, `java.util.Date` was used, but it's now outdated.
 * ✅ `java.time` package (from Java 8) is the modern alternative.
 */

public class Example1 {
	public static void main(String[] args) {
		
		// Fetch current time in milliseconds from Unix Epoch (1 Jan 1970)
		long currentMilliSeconds = System.currentTimeMillis();
		System.out.println("Current Milliseconds : " + currentMilliSeconds);
		
		// 🔄 Convert milliseconds to seconds, minutes, hours, days, years
		System.out.println("Seconds : " + (currentMilliSeconds / 1000));              // 1 second = 1000 ms
		System.out.println("Minutes : " + (currentMilliSeconds / 1000 / 60));         // 1 minute = 60 seconds
		System.out.println("Hours   : " + (currentMilliSeconds / 1000 / 60 / 60));    // 1 hour = 60 minutes
		System.out.println("Days    : " + (currentMilliSeconds / 1000 / 60 / 60 / 24)); // 1 day = 24 hours
		System.out.println("Years   : " + (currentMilliSeconds / 1000 / 60 / 60 / 24 / 365)); // Rough estimate
		
		// 🧠 Fun fact: System.currentTimeMillis() is often used to measure performance or elapsed time
		
		// 📌 Displaying raw long value and the maximum value long can hold
		System.out.println("Current Long Value       : " + currentMilliSeconds);
		System.out.println("Max Value Long Can Store : " + Long.MAX_VALUE);
		
		/*
		 * 📝 Teaching Notes:
		 * ---------------------
		 * - This is a low-level way to work with date/time.
		 * - You can measure durations or compare timestamps using this.
		 * - For actual date/time manipulation or formatting, prefer java.time API from Java 8.
		 * - Example: LocalDate, LocalDateTime, Instant, Duration, etc.
		 *
		 * 🚀 Want to go further?
		 * - Try: System.nanoTime() → more precise for benchmarking.
		 * - Use Date & Calendar (old APIs) only if maintaining legacy code.
		 */
	}
}