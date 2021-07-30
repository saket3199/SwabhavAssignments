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
	IGameioable IGameable;
	

	public Game(int size) {
		this.size = size;
		new Board(size);
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

	public void TakeInput() {
		Cell[][] boards = new Cell[size][size];
		Mark c = Mark.E;
		int row = 0;
		int col = 0;
		;

		board.generateBoard(boards);

		Cell cell = new Cell();
		IGameable.getUserName();
		boolean gameEnded = false;
		while (!gameEnded) {

			// Draw the board

			IGameable.drawBoard(boards);

			// Print whose turn it is
			if (player.isPlayer1()) {
				IGameable.whoseTurn(player.getP1(), 1);

			} else {
				IGameable.whoseTurn(player.getP2(), 2);
			}

			if (player.isPlayer1()) {
				c = Mark.X;
			} else {
				c = Mark.O;
			}

			while (true) {

				ArrayList<Integer> positions = IGameable.userPosition();
				row = positions.get(0);
				col = positions.get(1);

				if (row < 0 || col < 0 || row > size - 1 || col > size - 1) {
					IGameable.boardValidator(1);

				} else if (boards[row][col] != cell) {
					IGameable.boardValidator(2);

				} else {
					break;
				}

			}

			boards[row][col].setMark(c);

			if (resultAnalyzer.playerHasWon(boards) == Mark.X) {
				IGameable.printResult(player.getP1(), 1);
				gameEnded = true;
			} else if (resultAnalyzer.playerHasWon(boards) == Mark.O) {
				IGameable.printResult(player.getP2(), 1);
				gameEnded = true;
			} else {

				if (board.boardIsFull(boards)) {
					IGameable.printResult(player.getP1(), 0);
					gameEnded = true;
				} else {
					boolean p11 = player.isPlayer1();
					p11 = !player.isPlayer1();
				}

			}

		}

		IGameable.drawBoard(boards);

	}

}
