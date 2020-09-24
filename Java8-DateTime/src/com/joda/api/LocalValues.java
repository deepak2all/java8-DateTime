package com.joda.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalValues {
	
	public static void main(String[] args){
		
		/**************************************
		 * 1. Print Current Date and Time
		 **************************************
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println("Default date format ::: " + date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println("Customized date format 1 ::: " + dd+"-"+mm+"-"+yy);
		System.out.printf("Customized date format 2 ::: " + "%d-%d-%d",dd,mm,yy);
		System.out.println();
		LocalTime time = LocalTime.now();
		System.out.println("Default time format ::: " + time);
		
		int HH = time.getHour();
		int MM = time.getMinute();
		int SS = time.getSecond();
		System.out.printf("Customized time format ::: " + "%d:%d:%d",HH,MM,SS);
		System.out.println();
		
		System.out.println("Printing the date and time 1 :::");
		System.out.printf("%d-%d-%d  %d:%d:%d",dd,mm,yy,HH,MM,SS);
		System.out.println();
		
		System.out.println(LocalDateTime.now());
		LocalDateTime dt = LocalDateTime.now();
		int dtdd = dt.getDayOfMonth();
		int dtmm = dt.getMonthValue();
		int dtyy = dt.getYear();
		int dtHH = dt.getHour();
		int dtMM = dt.getMinute();
		System.out.println("Printing the date and time 2 :::");
		System.out.printf("%d-%d-%d  %d:%d",dtdd,dtmm,dtyy,dtHH,dtMM,SS);
		System.out.println();
		
		
		/**************************************
		 * 2. Print Other Dates
		 **************************************
		 */
		LocalDateTime dt1 = LocalDateTime.of(1983, 01, 06, 11, 30);
		System.out.println(dt1);
		System.out.println("After 6 months ::: " + dt1.plusMonths(6));
		System.out.println("After 6 months ::: " + dt1.minusMonths(6));
		//LocalDateTime dt2 = LocalDateTime.of(1983, Month.JANUARY, 06);
		
		/**************************************
		 * 3. Period
		 **************************************
		 */
		LocalDate bday = LocalDate.of(1983, 01, 06);
		LocalDate today = LocalDate.now();
		Period p = Period.between(bday, today);
		System.out.printf("Your age is %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		
		LocalDate deathday = LocalDate.of(1983+65, 01, 06);
		Period p1 = Period.between(today, deathday);
		int remDays = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
		System.out.printf("\nYou will be on earth only %d days ... Hurry up to complete imp work..", remDays);
		
		/**************************************
		 * 4. Year
		 **************************************
		 */
		System.out.println("\nThe year 1983 is a leap year "+ Year.isLeap(1983));
		
		
		/**************************************
		 * 5. TimeZone using ZoneId
		 **************************************
		 */
		System.out.println("\nThe default timezone is "+ ZoneId.systemDefault());
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
	}

}
