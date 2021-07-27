package com.project.tictactoe;

public interface IBoardable {
	public void generateBoard(Cell Board[][]);
	
	public boolean boardIsFull(Cell[][] board);

}
