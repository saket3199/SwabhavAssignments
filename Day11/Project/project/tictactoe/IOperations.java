package com.project.tictactoe;

import java.util.ArrayList;

public interface IOperations {
	

	public void drawBoard(Cells[][] board);
	public void getUserName();
	public ArrayList<Integer> userPosition();
}
