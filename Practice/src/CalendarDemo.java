import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main (String[] args) {
		Date d=new Date();
		Calendar cal=Calendar.getInstance();
		System.out.println(d.toString());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM));
	}

}
