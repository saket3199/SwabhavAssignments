package com.project.tictactoe.game;

import java.util.ArrayList;

import com.project.tictactoe.analyzer.ResultAnalyzer;
import com.project.tictactoe.board.Board;
import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;
import com.project.tictactoe.player.Player;


public class Game {
	private int size;
	private Board boards;
	private ResultAnalyzer resultAnalyzer;
	private Player player;
	private int row,col;

	

	public Game(int size) {
		this.size = size;
		row=0;
		col=0;
		player = new Player();
		boards = new Board(size);
		resultAnalyzer = new ResultAnalyzer(size);

	}

	public void startGame() {

		takeInput();
	}

	public int getSize() {
		return size;
	}

	public Cell[][] generateBoard() {
		boards.generateBoard(boards.getCells());
		return boards.getCells();
		
	}
	public int putMark(ArrayList<Integer> positions) {
		Mark c = Mark.E;
		if (player.isPlayer1()) {
			c = Mark.X;
		} else {
			c = Mark.O;
		}
		
		this.generateBoard()[row][col].setMark(c);
		row = positions.get(0);
		col = positions.get(1);

		if (row < 0 || col < 0 || row > size - 1 || col > size - 1) {
			return 1;

		} else if (this.generateBoard()[row][col]!=this.generateBoard()[row][col]) {
			return 2;

		}
		return 0;	
		
	}
	public int takeInput() {
		
		
		if (player.isPlayer1()) {
			return 1;

		} else {
			return 2;
		}
		
	}
		
	public int resultAnalysis() {

		if (resultAnalyzer.playerHasWon(this.generateBoard()) == Mark.X) {
			return 1;
		} else if (resultAnalyzer.playerHasWon(this.generateBoard()) == Mark.O) {
			return 2;
		} else {

			if (boards.boardIsFull(this.generateBoard())) {
				return 3;
			} else {
				boolean p11 = player.isPlayer1();
				p11 = !player.isPlayer1();
			}

		}
		
		return 0;
		
	}
	

}
