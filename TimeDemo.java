
import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TimeDemo {

public static void main(String[] args) {
	
	Clock clock = Clock.systemDefaultZone();
	System.out.println(clock);
	
	long millis = clock.millis();
	System.out.println(millis);

	//TimeZones
	System.out.println(ZoneId.getAvailableZoneIds());
	
	ZoneId zone1 = ZoneId.of("Asia/Calcutta");
	ZoneId zone2 = ZoneId.of("Brazil/East");
	System.out.println(zone1.getRules());
	System.out.println(zone2.getRules()); 
		 
	//LocalTime
	LocalTime now1 = LocalTime.now(zone1);
	LocalTime now2 = LocalTime.now(zone2);
	System.out.println(now1);
	System.out.println(now2);
	
	System.out.println(now1.isBefore(now2));  // false

	long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
	long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

	System.out.println(hoursBetween);       // -3
	System.out.println(minutesBetween);  
	
	//
	/*LocalTime late = LocalTime.of(23, 59, 59);
	System.out.println(late);*/
	}

} 

