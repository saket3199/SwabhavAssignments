package com.project.tictactoe;

import java.util.ArrayList;
import com.techlab.tictactoe.ResultEnum;

public class Game {
	private GameIO gameIO;
	private int size;
	private Board board;
	private ResultAnalyzer resultAnalyzer;
	private Player player;

	public Game(int size) {
		this.size = size;
		new Board(size);
		player = new Player();
		gameIO = new GameIO(size);
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
		gameIO.getUserName();
		boolean gameEnded = false;
		while (!gameEnded) {

			// Draw the board

			gameIO.drawBoard(boards);

			// Print whose turn it is
			if (player.isPlayer1()) {
				gameIO.whoseTurn(player.getP1(), 1);

			} else {
				gameIO.whoseTurn(player.getP2(), 2);
			}

			if (player.isPlayer1()) {
				c = Mark.X;
			} else {
				c = Mark.O;
			}

			while (true) {

				ArrayList<Integer> positions = gameIO.userPosition();
				row = positions.get(0);
				col = positions.get(1);

				if (row < 0 || col < 0 || row > size - 1 || col > size - 1) {
					gameIO.boardValidator(1);

				} else if (boards[row][col] != cell) {
					gameIO.boardValidator(2);

				} else {
					break;
				}

			}

			boards[row][col].setMark(c);

			if (resultAnalyzer.playerHasWon(boards) == Mark.X) {
				gameIO.printResult(player.getP1(), 1);
				gameEnded = true;
			} else if (resultAnalyzer.playerHasWon(boards) == Mark.O) {
				gameIO.printResult(player.getP2(), 1);
				gameEnded = true;
			} else {

				if (board.boardIsFull(boards)) {
					gameIO.printResult(player.getP1(), 0);
					gameEnded = true;
				} else {
					boolean p11;
					p11 = player.isPlayer1();
					p11 = !player.isPlayer1();
				}

			}

		}

		gameIO.drawBoard(boards);

	}

}
