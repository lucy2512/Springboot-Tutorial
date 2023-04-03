package com.parthib25dec.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
}
