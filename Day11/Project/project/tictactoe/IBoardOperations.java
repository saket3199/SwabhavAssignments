package com.project.tictactoe;

public interface IBoardOperations {
	public void generateBoard(Cells Board[][]);
	
	public boolean boardIsFull(Cells[][] board);

}
