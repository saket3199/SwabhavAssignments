package com.project.tictactoe.test;

import com.project.tictactoe.game.Game;
import com.project.tictactoe.game.GameIO;

public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameIO  gameIo =new GameIO();
		Game game = new Game(gameIo.boardSize());
		game.startGame(); 
		
		
	}


}
