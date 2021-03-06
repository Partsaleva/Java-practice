import java.util.Calendar;

/*You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?*/
public class Problem19 {

	public static void main(String[] args) {
		int startYear=1900;
		int endYear=2000;
		int leapYear=0;
		double days=(endYear -startYear)*365 +(endYear -startYear)/4;
		
		for (int year = 1901; year < 2001; year++) {
			if (isLeapYear(year)) {
				leapYear++;
			}
		}
		
		double avgDaysOnYear=days/(endYear -startYear);
		int avgSundaysOnYear=2;
		System.out.println(Math.round(avgDaysOnYear/avgSundaysOnYear -leapYear/avgSundaysOnYear));
		
		
		bruteForce();
	}

	public static boolean isLeapYear(int year){
		return ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0);
		
	}
	
	public static void bruteForce(){
		Calendar date = Calendar.getInstance();
		int sundays = 0;
		 
		for (int year = 1901; year <= 2000; year++) {
		    for (int month = 1; month <= 12; month++) {
		       date.set(year, month,1);
		       if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
		           sundays++;
		       }
		    }
		}
		System.out.println(sundays);
	}
}
