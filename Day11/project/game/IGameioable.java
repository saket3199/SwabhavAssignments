package com.project.tictactoe.game;

import java.util.ArrayList;

import com.project.tictactoe.cell.Cell;

public interface IGameioable {
	

	public void drawBoard(Cell[][] board);
	public void getUserName();
	public ArrayList<Integer> userPosition();
	public void whoseTurn(String p1, int i);
	public void boardValidator(int i);
	public void printResult(String p1, int i);

	}
