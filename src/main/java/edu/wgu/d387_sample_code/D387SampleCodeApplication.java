package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.util.WelcomeTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}