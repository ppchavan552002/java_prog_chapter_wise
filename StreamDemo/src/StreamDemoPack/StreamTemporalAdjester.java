package StreamDemoPack;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;



public class StreamTemporalAdjester {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate nextPayDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
//		System.out.println(nextPayDay);
		 
		TemporalAdjuster  Next_workDay = w -> {
			LocalDate result= LocalDate.from(w);
			do {
				result=result.plusDays(1);
			}while(result.getDayOfWeek().getValue()>=6);
			return result;
		};
		LocalDate today=LocalDate.now();
		System.out.println(today);
		LocalDate backToWork=today.with(Next_workDay);
		
		System.out.println(backToWork);
	}

}
