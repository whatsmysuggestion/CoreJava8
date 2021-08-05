
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate yesterday = tomorrow.minusDays(2);
		System.out.println(yesterday);

		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println(dayOfWeek);
	}

}
