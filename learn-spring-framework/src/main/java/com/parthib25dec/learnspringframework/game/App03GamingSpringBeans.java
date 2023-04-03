package com.parthib25dec.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.parthib25dec.learnspringframework.game.GameRunner;
import com.parthib25dec.learnspringframework.game.MarioGame;
import com.parthib25dec.learnspringframework.game.PacMan;
import com.parthib25dec.learnspringframework.game.SuperContaGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			//context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
