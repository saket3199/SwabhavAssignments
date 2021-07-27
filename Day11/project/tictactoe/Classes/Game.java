package com.project.tictactoe;

import java.util.ArrayList;
import com.techlab.tictactoe.ResultEnum;

public class Game {
	private GameIO GameIO;
	private int size;
	private Board Board;
	private ResultAnalyzer ResultAnalyzer;
	private Player player;

	public Game(int size) {
		this.size = size;
		new Board(size);
		player = new Player();
		GameIO = new GameIO(size);
		Board = new Board(size);
		ResultAnalyzer = new ResultAnalyzer(size);

	}

	public void startGame() {

		TakeInput();
	}

	public int getSize() {
		return size;
	}

	public void TakeInput() {
		Cell[][] board = new Cell[size][size];
		Mark c = Mark.E;
		int row = 0;
		int col = 0;
		;

		Board.generateBoard(board);

		Cell cell = new Cell();
		GameIO.getUserName();
		boolean gameEnded = false;
		while (!gameEnded) {

			// Draw the board

			GameIO.drawBoard(board);

			// Print whose turn it is
			if (player.isPlayer1()) {
				GameIO.whoseTurn(player.getP1(), 1);

			} else {
				GameIO.whoseTurn(player.getP2(), 2);
			}

			if (player.isPlayer1()) {
				c = Mark.X;
			} else {
				c = Mark.O;
			}

			while (true) {

				ArrayList<Integer> position = GameIO.userPosition();
				row = position.get(0);
				col = position.get(1);

				if (row < 0 || col < 0 || row > size - 1 || col > size - 1) {
					System.out.println("This position is off the bounds of the board! Try again.");

				} else if (board[row][col] != cell) {
					System.out.println("Someone has already made a move at this position! Try again.");

				} else {
					break;
				}

			}

			board[row][col].setMark(c);

			if (ResultAnalyzer.playerHasWon(board) == Mark.X) {
				GameIO.printResult(player.getP1(), 1);
				gameEnded = true;
			} else if (ResultAnalyzer.playerHasWon(board) == Mark.O) {
				GameIO.printResult(player.getP2(), 1);
				gameEnded = true;
			} else {

				if (Board.boardIsFull(board)) {
					GameIO.printResult(player.getP1(), 0);
					gameEnded = true;
				} else {
					boolean p11;
					p11 = player.isPlayer1();
					p11 = !player.isPlayer1();
				}

			}

		}

		GameIO.drawBoard(board);

	}

}
