package com.project.tictactoe;

import java.util.ArrayList;

public interface IGameioable {
	

	public void drawBoard(Cell[][] board);
	public void getUserName();
	public ArrayList<Integer> userPosition();
}
