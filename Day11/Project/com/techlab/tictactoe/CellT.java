package com.techlab.tictactoe;

public class CellT {
	private Mark mark;
	private int row;
    private int col;

       public CellT(Mark mark,int row, int col){
           this.row = row;
           this.col = col;
           this.mark = mark;
       }

	public Mark getMark() {
		return mark;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	 
}
