package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.l18n.Translation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
		System.out.println(Translation.getWelcomeMessage("en_US"));
		System.out.println(Translation.getWelcomeMessage("fr_CA"));

	}

}
