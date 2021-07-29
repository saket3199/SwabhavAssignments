package com.project.tictactoe.board;

import com.project.tictactoe.cell.Cell;

public interface IBoardable {
	public void generateBoard(Cell Board[][]);
	
	public boolean boardIsFull(Cell[][] board);

}
