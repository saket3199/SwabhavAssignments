package com.project.tictactoe.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.tictactoe.board.Board;
import com.project.tictactoe.game.Game;

class GameTest {

	@Test
	void testGame() {
//		fail("Not yet implemented");
		//arrange
		int expectedSize = 3;
		
		//act
		Game game = new Game(expectedSize);
		Board board = new Board(expectedSize);
		//assert
		try {
			assert.assertEquals(expectedSize, board.getSize());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	

}
