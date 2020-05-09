package com.laazer.duel_monsters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DuelMonstersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuelMonstersApplication.class, args);
	}

	@GetMapping("/duel")
	public String duel()  {
		Integer.MAX_VALUE
		return "It's time to du du du du du du duel!!!";
	}
}
