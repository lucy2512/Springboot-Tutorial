package com.parthib25dec.learnspringframework.game;

public class SuperContaGame implements GamingConsole{

	public void up() {
		System.out.println("Stand up");
	}
	
	public void down() {
		System.out.println("Stand down");
	}
	
	public void left() {
		System.out.println("Target");
	}
	
	public void right() {
		System.out.println("Shoot");
	}
}
