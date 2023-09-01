package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.l18n.TimeConverter;
import edu.wgu.d387_sample_code.l18n.Translation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Translation welcomeFR = new Translation("fr_CA");
		Translation welcomeEN = new Translation("en_US");

		Thread loadResourcesFR = new Thread(() -> {
			welcomeFR.InitializeLocale();
			Translation.translations.put("fr_CA", welcomeFR);
		});

		Thread loadResourcesEN = new Thread(() -> {
			welcomeEN.InitializeLocale();
			Translation.translations.put("en_US", welcomeEN);
		});

		loadResourcesFR.start();
		loadResourcesEN.start();
	}

}
