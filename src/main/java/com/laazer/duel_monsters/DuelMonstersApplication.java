package com.laazer.duel_monsters;

import com.laazer.duel_monsters.models.MonsterCard;
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
		return "It's time to du du du du du du duel!!!";
	}

	@GetMapping("/blueEyesWhiteDragon")
	public MonsterCard blueEyesWhiteDragon() {
		MonsterCard blueEyesWhiteDragon = new MonsterCard("Blue-Eyes White Dragon", 3000, 2500,
				"Dragon/Normal", 8, "Light");
		return blueEyesWhiteDragon;
	}

	@GetMapping("/darkMagician")
	public MonsterCard darkMagician() {
		MonsterCard darkMagician = new MonsterCard("Dark Magician", 2500, 2100,
				"Spellcaster/Normal", 7, "Dark");
		return darkMagician;
	}

	@GetMapping("/celticGuardian")
	public MonsterCard celticGuardian() {
		MonsterCard celticGuardian = new MonsterCard("Celtic Guardian", 1400, 1200,
				"Warrior", 4, "Earth");
		return celticGuardian;
	}
}
