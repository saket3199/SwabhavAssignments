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

		for (int i = 0; i < ogBoard.getSize(); i++) {
			for (int j = 0; j < ogBoard.getSize(); j++)
				if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0].getMark() != Mark.E) {
					return board[i][0].getMark();
				}
		}

		for (int j = 0; j < ogBoard.getSize(); j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j].getMark() != Mark.E) {
				return board[0][j].getMark();
			}
		}

		for (int k = 0; k < ogBoard.getSize(); k++) {
			if (board[k][k] == board[k + 1][k + 1] && board[k][k].getMark() != Mark.E) {
				return board[0][0].getMark();
			}
		}
		for (int l = ogBoard.getSize(); l > 0;) {
			int z = 0;
			if (board[l][z] == board[z][z] && board[z + 1][z + 1] == board[z][l] && board[l][z].getMark() != Mark.E) {
				z++;
				
				
			}
			return board[2][0].getMark();
		}

		return Mark.E;

	}

	

}
