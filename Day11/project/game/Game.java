package com.project.tictactoe.game;

import java.util.ArrayList;

import com.project.tictactoe.analyzer.ResultAnalyzer;
import com.project.tictactoe.board.Board;
import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;
import com.project.tictactoe.player.Player;


public class Game {
	private int size;
	private Board board;
	private ResultAnalyzer resultAnalyzer;
	private Player player;
	private int row,col;
	private Cell cell;

	

	public Game(int size) {
		this.size = size;
		new Board(size);
		cell = new Cell();
		row=0;
		col=0;
		player = new Player();
		board = new Board(size);
		resultAnalyzer = new ResultAnalyzer(size);

	}

	public void startGame() {

		TakeInput();
	}

	public int getSize() {
		return size;
	}

	public Cell[][] generateBoard() {
		Cell[][] boards = new Cell[size][size];
		
		return boards;
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

		} else if (this.generateBoard()[row][col] != cell) {
			return 2;

		}
		return 0;	
		
	}
	public int TakeInput() {
		
		
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

			if (board.boardIsFull(this.generateBoard())) {
				return 3;
			} else {
				boolean p11 = player.isPlayer1();
				p11 = !player.isPlayer1();
			}

		}
		
		return 0;
		
	}
	

}
