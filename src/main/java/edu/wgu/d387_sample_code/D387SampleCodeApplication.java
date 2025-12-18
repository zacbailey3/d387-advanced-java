package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.util.TimeZoneUtil;
import edu.wgu.d387_sample_code.util.WelcomeTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

		Thread englishThread =
				new Thread(new WelcomeTask(Locale.US));

		Thread frenchThread =
				new Thread(new WelcomeTask(Locale.CANADA_FRENCH));

		englishThread.start();
		frenchThread.start();

		LocalDateTime presentationTime =
				LocalDateTime.of(2025, 1, 15, 13, 0); // 1:00 PM ET

		ZonedDateTime et =
				TimeZoneUtil.convertTime(
						presentationTime,
						ZoneId.of("America/New_York"),
						ZoneId.of("America/New_York"));

		ZonedDateTime mt =
				TimeZoneUtil.convertTime(
						presentationTime,
						ZoneId.of("America/New_York"),
						ZoneId.of("America/Denver"));

		ZonedDateTime utc =
				TimeZoneUtil.convertTime(
						presentationTime,
						ZoneId.of("America/New_York"),
						ZoneId.of("UTC"));

		System.out.println("Online Live Presentation at the Landon Hotel - Presentation Times:");
		System.out.println("ET: " + et.toLocalTime());
		System.out.println("MT: " + mt.toLocalTime());
		System.out.println("UTC: " + utc.toLocalTime());
	}

}