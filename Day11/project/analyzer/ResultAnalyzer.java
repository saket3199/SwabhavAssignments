package com.project.tictactoe.analyzer;

import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;
import com.techlab.tictactoe.Board;

public class ResultAnalyzer implements IResultable {
	public static Cell[][] boards;
	private Board ogBoard;

	public ResultAnalyzer(int size) {
		boards = new Cell[size][size];
		ogBoard = new Board(size);
	}

	public Mark playerHasWon(Cell[][] board) {

		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0].getMark() != Mark.E) {
				return board[i][0].getMark();
			}
		}

	
		for (int j = 0; j < board.length; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j].getMark() != Mark.E) {
				return board[0][j].getMark();
			}
		}

	
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0].getMark() != Mark.E) {
			return board[0][0].getMark();
		}
		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0].getMark() != Mark.E) {
			return board[2][0].getMark();
		}

		return Mark.E;
	}

	

}
