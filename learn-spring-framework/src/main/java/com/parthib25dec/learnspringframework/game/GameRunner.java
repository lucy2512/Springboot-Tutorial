package com.parthib25dec.learnspringframework.game;

public class GameRunner {

	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Game is running -" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
