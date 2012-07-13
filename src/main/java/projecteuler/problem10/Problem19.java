package projecteuler.problem10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problem19 {

	public static int countSundayFirsts() {
		int result = 0;
		Calendar start = new GregorianCalendar(1901, Calendar.JANUARY, 1);
		Calendar end = new GregorianCalendar(2000, Calendar.DECEMBER, 31);
		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result++;
			}
			start.add(Calendar.MONTH, 1);
		}

		return result;
	}

}
