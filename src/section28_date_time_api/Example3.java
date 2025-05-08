package section28_date_time_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section28_date_time_api
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 * 📆 Working With GregorianCalendar and TimeZone
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 *
 * ✅ GregorianCalendar is a concrete subclass of Calendar.
 * ✅ TimeZone represents a time zone offset, and also figures out daylight savings.
 * 🔁 Supports different regions and calculations like leap years.
 */

public class Example3 {
	public static void main(String[] args) {
		
		// 🔹 Create calendar instance with default system TimeZone
		GregorianCalendar calendar = new GregorianCalendar();
		
		// 🔍 Check leap year
		boolean isLeapYear = calendar.isLeapYear(2024);
		System.out.println("✅ Is 2024 a Leap Year? : " + isLeapYear);
		
		// 🔍 Extract common date components
		int date = calendar.get(Calendar.DATE);
		System.out.println("📅 Current Date (Day)   : " + date);
		
		int month = calendar.get(Calendar.MONTH); // 0 = Jan, 11 = Dec
		System.out.println("📆 Current Month (0-11) : " + month);
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("📌 Day Of The Month     : " + dayOfMonth);
		
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("📌 Day Of The Year      : " + dayOfYear);
		
		// 🌍 Get default system time zone
		TimeZone tz = calendar.getTimeZone();
		System.out.println("🌐 Default TimeZone     : " + tz);
		System.out.println("🆔 TimeZone ID          : " + tz.getID());
		System.out.println("⏰ TimeZone Offset (ms) : " + tz.getRawOffset());
		/*
		 * 📝 Developer Notes:
		 * ----------------------
		 * - GregorianCalendar is still widely used for legacy and internationalization needs.
		 * - For modern applications, prefer java.time.* classes like ZonedDateTime, LocalDate, etc.
		 * - TimeZone ID examples: "Asia/Kolkata", "UTC", "Europe/Paris", "America/Los_Angeles"
		 * - Useful for global applications requiring timezone handling.
		 */
	}
}