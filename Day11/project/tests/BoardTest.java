package com.project.tictactoe.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.tictactoe.board.Board;
import com.project.tictactoe.cell.Cell;

class BoardTest {
	Board board;
	@Test
	void testBoard() {
//		fail("Not yet implemented");
		//arrange
		int expectedSize =3;
		
		//act
		board = new Board(expectedSize);
		//assert
		assert.assertEquals(expectedSize, board.getSize());
	}
	@Test
	void testgenerateBoard() {
		//arrange
		Cell[][] boards = null ;
		
		int expectedSize=3;
		//act
		board = new Board(expectedSize);
		board.generateBoard(boards);
		
		
	}
	@Test
	void boardIsFull() {
		//arrange
		Cell boards[][] = null;
		boolean value = false;
		int expectedSize=3;
		//act
		board = new Board(expectedSize);
		
		//assert
		assert.assertEquals(value,board.boardIsFull(boards));
		
	}

	

}
