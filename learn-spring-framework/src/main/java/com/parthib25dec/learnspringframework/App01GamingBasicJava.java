package com.parthib25dec.learnspringframework;

import com.parthib25dec.learnspringframework.game.GameRunner;
import com.parthib25dec.learnspringframework.game.MarioGame;
import com.parthib25dec.learnspringframework.game.PacMan;
import com.parthib25dec.learnspringframework.game.SuperContaGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContaGame();
		var game = new PacMan(); //Creating object
		var gameRunner = new GameRunner(game);//Creating object + wiring dependency
		gameRunner.run();
		
	}

}
