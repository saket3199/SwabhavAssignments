package com.project.tictactoe;

public class Board {
	private int size;
	public Board(int size) {
		this.size=size;
		
	}
	public int getSize() {
		return size;
	}
	
	public void generateBoard(Cell board[][]) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Cell.E ;
			}
		}
	}
	
	public boolean boardIsFull(Cell[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] == Cell.E) {
					return false;
				}
			}
		}
		return true;
	}
}
