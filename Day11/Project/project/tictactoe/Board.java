package com.project.tictactoe;

public class Board implements IBoardOperations {
	private int size;
	private Cells[][] cells;
	public Board(int size) {
		this.size=size;
		cells = new Cells[size][size];
		
	}
	public int getSize() {
		return size;
	}
	
	public void generateBoard(Cells board[][]) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				Cells cell = new Cells();
				board[i][j] = cell ;
			}
		}
	}
	
	public boolean boardIsFull(Cells[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j].getMark() == Mark.E) {
					return false;
				}
			}
		}
		return true;
	}
	
}
