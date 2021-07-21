package tcom.techab.tictactoe.test;

import java.util.Scanner;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.ResultAnalysis;
import com.techlab.tictactoe.ResultEnum;

public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = new char[3][3];
		char c = '-';
		int row = 0;
		int col = 0;
		Board B = new Board();
		ResultAnalysis Result = new ResultAnalysis();

		B.generateBoard(board);

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

			B.drawBoard(board);

			// Print whose turn it is
			if (player1) {
				System.out.println(p1 + "'s Turn ("+Mark.X+"):");
			} else {
				System.out.println(p2 + "'s Turn ("+Mark.O+"):");
			}

			if (player1) {
				c = 'X';
			} else {
				c = 'O';
			}

			while (true) {

				System.out.print("Enter a row number (1, 2, or 3): ");
				row = in.nextInt();
				System.out.print("Enter a column number (1, 2, or 3): ");
				col = in.nextInt();

				if (row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("This position is off the bounds of the board! Try again.");

				} else if (board[row][col] != '-') {
					System.out.println("Someone has already made a move at this position! Try again.");

				} else {
					break;
				}

			}

			board[row][col] = c;

			if (Result.playerHasWon(board) == 'x') {
				System.out.println(p1 + " has " + ResultEnum.Won);
				gameEnded = true;
			} else if (Result.playerHasWon(board) == 'o') {
				System.out.println(p2 + " has " + ResultEnum.Won);
				gameEnded = true;
			} else {

				if (B.boardIsFull(board)) {
					System.out.println("It's a " + ResultEnum.Tie);
					gameEnded = true;
				} else {

					player1 = !player1;
				}

			}

		}

		B.drawBoard(board);
		in.close();

	}

}
