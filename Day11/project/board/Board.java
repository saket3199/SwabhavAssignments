package com.project.tictactoe;

public class Board implements IBoardable {
	private int size;
	private Cell[][] cells;
	public Board(int size) {
		this.size=size;
		cells = new Cell[size][size];
		
	}
	public int getSize() {
		return size;
	}
	
	public void generateBoard(Cell board[][]) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				Cell cell = new Cell();
				board[i][j] = cell ;
			}
		}
	}
	
	public boolean boardIsFull(Cell[][] board) {
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
