package com.project.tictactoe.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.tictactoe.analyzer.ResultAnalyzer;
import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.game.Game;
import com.project.tictactoe.mark.Mark;

class ResultAnalyzerTest {

	@Test
	void testResultAnalyzer() {
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
	@Test
	void testplayerHasWon() {
		//arrange
		Cell boards[][] = null;
		Mark mark = Mark.E;
		int expectedSize=3;
		//act
		ResultAnalyzer analyzer = ResultAnalyzer(expectedSize);
		//assert
		assert.assertEquals(mark, analyzer.playerHasWon(boards));
}

}
