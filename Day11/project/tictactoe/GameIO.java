package com.project.tictactoe;

import java.util.Scanner;

import com.techlab.tictactoe.ResultEnum;



public class GameIO {
	private Board Board;
	private ResultAnalyzer ResultAnalyzer;
	private int size;
	public GameIO(int size) {
		this.size=size;
		Board = new Board(size);
		ResultAnalyzer = new ResultAnalyzer(size);
		
	}

	public void TakeInput() {
		Cell[][] board = new Cell[size][size];
		Cell c = Cell.E;
		int row = 0;
		int col = 0;
//		Board B = new Board(3);
//		ResultAnalysis Result = new ResultAnalysis();

		Board.generateBoard(board);

		Scanner in = new Scanner(System.in);
		System.out.println("Let's play Tic Tac Toe!");
		System.out.print("Player 1, what is your name? ");
		String p1 = in.nextLine();
		System.out.print("Player 2, what is your name? ");
		String p2 = in.nextLine();

		boolean player1 = true;
		boolean gameEnded = false;
		while (!gameEnded) {

			// Draw the board

			Board.drawBoard(board);

			// Print whose turn it is
			if (player1) {
				System.out.println(p1 + "'s Turn ("+Cell.X+"):");
			} else {
				System.out.println(p2 + "'s Turn ("+Cell.O+"):");
			}

			if (player1) {
				c = Cell.X;
			} else {
				c = Cell.O;
			}

			while (true) {

				System.out.print("Enter a row number (0, 1, or 2): ");
				row = in.nextInt();
				System.out.print("Enter a column number (0, 1, or 2): ");
				col = in.nextInt();

				if (row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("This position is off the bounds of the board! Try again.");

				} else if (board[row][col] != Cell.E) {
					System.out.println("Someone has already made a move at this position! Try again.");

				} else {
					break;
				}

			}

			board[row][col] = c;

			if (ResultAnalyzer.playerHasWon(board) == Cell.X) {
				System.out.println(p1 + " has " + ResultEnum.Won);
				gameEnded = true;
			} else if (ResultAnalyzer.playerHasWon(board) == Cell.O) {
				System.out.println(p2 + " has " + ResultEnum.Won);
				gameEnded = true;
			} else {

				if (Board.boardIsFull(board)) {
					System.out.println("It's a " + ResultEnum.Tie);
					gameEnded = true;
				} else {

					player1 = !player1;
				}

			}

		}

		Board.drawBoard(board);
		in.close();

	}
}
