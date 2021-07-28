package com.project.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testBoard() {
//		fail("Not yet implemented");
		//arrange
		int expectedSize =3;
		
		//act
		Board board = new Board(expectedSize);
		//assert
		assert.assertEquals(expectedSize, board.getSize());
	}

	

}
