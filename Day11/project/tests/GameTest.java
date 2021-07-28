package com.project.tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testGame() {
//		fail("Not yet implemented");
		//arrange
		int expectedSize = 3;
		
		//act
		Game game = new Game(expectedSize);
		//assert
		try {
			assert.assertEquals(expectedSize, Board.getSize());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
