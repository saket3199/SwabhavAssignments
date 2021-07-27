package com.project.tictactoe;

import com.techlab.tictactoe.Board;

public class ResultAnalyzer implements IResultable {
	public static Cell[][] board;
	private Board Board;

	public ResultAnalyzer(int size) {
		board = new Cell[size][size];
		Board = new Board(size);
	}

	public Mark playerHasWon(Cell[][] board) {

		for (int i = 0; i < Board.getSize(); i++) {
			for (int j = 0; j < Board.getSize(); j++)
				if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0].getMark() != Mark.E) {
					return board[i][0].getMark();
				}
		}

		for (int j = 0; j < Board.getSize(); j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j].getMark() != Mark.E) {
				return board[0][j].getMark();
			}
		}

		for (int k = 0; k < Board.getSize(); k++) {
			if (board[k][k] == board[k + 1][k + 1] && board[k][k].getMark() != Mark.E) {
				return board[0][0].getMark();
			}
		}
		for (int l = Board.getSize(); l > 0;) {
			int z = 0;
			if (board[l][z] == board[z][z] && board[z + 1][z + 1] == board[z][l] && board[l][z].getMark() != Mark.E) {
				z++;
				
				
			}
			return board[2][0].getMark();
		}

		return Mark.E;

	}

}
