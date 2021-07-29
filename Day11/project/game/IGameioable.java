package com.project.tictactoe.game;

import java.util.ArrayList;

import com.project.tictactoe.cell.Cell;

public interface IGameioable {
	

	public void drawBoard(Cell[][] board);
	public void getUserName();
	public ArrayList<Integer> userPosition();
}
