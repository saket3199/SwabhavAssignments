package com.project.tictactoe.analyzer;

import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;

public interface IResultable {
	public Mark playerHasWon(Cell[][] board);

}
