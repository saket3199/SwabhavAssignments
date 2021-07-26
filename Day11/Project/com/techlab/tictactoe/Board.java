package com.techlab.tictactoe;

public class Board {
	private int size;
	private CellT board[][];
	
	public Board(int size) {
		this.size=size;
		board=new CellT[size][size];
		
	}
	public int getSize() {
		return size;
	}
	
	public void generateBoard(CellT board[][]) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				board[i][j] = baor(Mark.X,i,j);
			}
		}
	}
	
	public void drawBoard(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean boardIsFull(char[][] board) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	

}
