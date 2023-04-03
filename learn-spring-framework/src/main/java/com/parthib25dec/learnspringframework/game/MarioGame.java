package com.parthib25dec.learnspringframework.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go down");
	}
	
	public void left() {
		System.out.println("Go slow");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
