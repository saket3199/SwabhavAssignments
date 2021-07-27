package com.project.tictactoe;

public class Cells {
	private Mark mark;
	public Cells() {
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
