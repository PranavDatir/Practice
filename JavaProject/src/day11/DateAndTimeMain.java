package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// Creating system date, time and timestamp
		LocalDate today = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		
		System.out.println(today);
		System.out.println(currentTime);
		System.out.println(currentTimeStamp);
		
		//Customizeing the date:
		LocalDate independanceDate = LocalDate.of(1947, 8, 15);
		System.out.println(independanceDate);
		
		LocalDate nextDate = today.plus(5, ChronoUnit.DAYS);
		System.out.println(nextDate);		
	}
}
