package com.project.tictactoe.board;

import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;

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
	public Cell getCell(int i, int j){
		return cells[i][j];
	}
	public Cell[][] getCells() {
		return cells;
	}
	public void generateBoard(Cell cells[][]) {
		for(int i = 0; i < cells.length; i++) {
			for(int j = 0; j < cells[i].length; j++) {
				Cell cell = new Cell();
				cells[i][j] = cell ;
			}
		}
	}
	
	public boolean boardIsFull(Cell[][] cells) {
		for(int i = 0; i < cells.length; i++) {
			for(int j = 0; j < cells.length; j++) {
				if(cells[i][j].getMark() == Mark.E) {
					return false;
				}
			}
		}
		return true;
	}
	
}
