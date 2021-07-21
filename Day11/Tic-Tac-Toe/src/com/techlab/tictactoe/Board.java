package com.techlab.tictactoe;

public class Board {
	
	public void generateBoard(char board[][]) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public void drawBoard(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

}
