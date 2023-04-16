package org.alexthunder.fintm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinTMApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinTMApplication.class, args);
	}

	@GetMapping("/fintm")
	public String fin(@RequestParam(value = "tm", defaultValue = "TM!") String tm) {
		return String.format(" - Fin?<br/> - %s", tm);
	}
}
