package StreamDemoPack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class StreamDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		LocalDate christmas2015=LocalDate.of(2015, 12, 25);
		LocalDate christmas12015=LocalDate.of(2015,Month.DECEMBER,25);
		System.out.println(today);
		System.out.println(christmas2015);
		System.out.println(christmas12015);
		
		//in before java 8
		System.out.println();
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		Date dt=c.getTime();
		System.out.println(c);
		System.out.println(dt);
		
		///using local date plus
		System.out.println();
		LocalDate tomorrow=LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		
		//time
		LocalDateTime a=LocalDateTime.now();
		System.out.println(a);
		
		//print last date of month
		System.out.println();
		LocalDate nextPayDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(nextPayDay);
		
		//
		System.out.println();
		
	}

}
