package com.project.tictactoe;

import com.techlab.tictactoe.Board;

public class ResultAnalyzer {
	public static Cell[][] board; 
	private Board Board;
	public ResultAnalyzer(int size) {
		board= new Cell[size][size];
		Board=new Board(size);
	}

	public Cell playerHasWon(Cell[][] board) {

		
		for (int i = 0; i < Board.getSize(); i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != Cell.E) {
				return board[i][0];
			}
		}

	
		for (int j = 0; j < Board.getSize(); j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != Cell.E) {
				return board[0][j];
			}
		}

	
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != Cell.E) {
			return board[0][0];
		}
		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != Cell.E) {
			return board[2][0];
		}

		return Cell.E;

	}

}
