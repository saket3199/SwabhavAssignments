package com.project.tictactoe.cell;

import com.project.tictactoe.mark.Mark;

public class Cell {
	private Mark mark;
	public Cell() {
	    this.setMark(Mark.E);
	  }
	public Mark getMark() {
		return mark;
	}
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	  public boolean checkCellTaken() {
		    if(this.mark != Mark.E) {
		      return true;
		    }
		    return false;
		  }
	
	

}
