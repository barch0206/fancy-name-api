package com.fancyname.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@SpringBootApplication
@RestController
public class FancynameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FancynameApplication.class, args);
	}

	private final String[] titles = {
		"Sir", "Duke", "Count", "Captain", "Baron", "Wizard", "Ninja", "Professor", "Lord", "Master"
	};

	private final String[] suffixes = {
		"the Java Whisperer", "of the Cloud", "Destroyer of Bugs", "the Immutable", "the Groovy", "of Kubernetes",
		"the Backend Slayer", "who Codes in Darkness", "with Lightning in Fingers", "the Eternal Debugger"
	};

	@GetMapping("/generate")
	public String generateFancyName(@RequestParam String name) {
		Random rand = new Random();
		String title = titles[rand.nextInt(titles.length)];
		String suffix = suffixes[rand.nextInt(suffixes.length)];

		String fancyName = String.format("%s %s %s", title, name, suffix);
		return fancyName;
	}
}
