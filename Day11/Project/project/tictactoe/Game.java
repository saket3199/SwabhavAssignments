package com.project.tictactoe;

public class Game {
	private GameIO GameIO;
	private int size;
	
	public Game(int size) {
		this.size=size;
		new Board(size);
		GameIO= new GameIO(size);
		
	}
	public void startGame() {
		
		GameIO.TakeInput();
	}
	public int getSize() {
		return size;
	}
	

}
