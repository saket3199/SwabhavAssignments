package com.project.tictactoe.game;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.tictactoe.analyzer.ResultAnalyzer;
import com.project.tictactoe.board.Board;
import com.project.tictactoe.cell.Cell;
import com.project.tictactoe.mark.Mark;
import com.project.tictactoe.player.Player;
import com.techlab.tictactoe.ResultEnum;

public class GameIO implements IGameioable {
	private int size;
	private Player player;
	private Scanner input = new Scanner(System.in);;
	private Game game;

	public GameIO() {
		game = new Game(boardSize());
	}

	public int boardSize() {
		System.out.println("Enter Board Size");
		return this.size = input.nextInt();
	}

	public void getUserName() {

		System.out.println("Let's play Tic Tac Toe!");
		System.out.print("Player 1, what is your name? \n");
		String p1 = input.next();
		System.out.print("Player 2, what is your name? \n");
		String p2 = input.next();
		player = new Player(p1, p2);
		player.setPlayer1(true);

	}

	public void play() {
		this.drawBoard(game.getBoard().getCells());
		this.getUserName();

		while (true) {
			this.drawBoard(game.getBoard().getCells());
//			int j = game.takeInput();
//			if (j == 1 || j == 2) {
				this.whoseTurn(game.takeInput());
//			}
			while (true) {
				int i = game.putMark(this.userPosition());
				if (i == 1 || i == 2) {
					this.boardValidator(i);
				} else {
					break;
				}
			}
			int i = game.resultAnalysis();
			if (i == 1 || i == 2 || i == 3) {
				this.printResult(i);
				break;
			}
		}
		this.drawBoard(game.getBoard().getCells());

	}

	public void boardValidator(int i) {
		switch (i) {
		case 1:
			System.out.println("This position is off the bounds of the board! Try again.");
		case 2:
			System.out.println("Someone has already made a move at this position! Try again.");
		default:
			System.err.println("System Error");
		}
	}

	public ArrayList<Integer> userPosition() {

		System.out.print("Enter a row number (0, 1, or 2): ");
		int row = input.nextInt();
		System.out.print("Enter a column number (0, 1, or 2): ");
		int col = input.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(row);
		array.add(col);
		return array;

	}

	public void printResult(int i) {
		switch (i) {
		case 1:
			System.out.println(player.getP1() + " has " + ResultEnum.Won);
		case 2:
			System.out.println(player.getP2() + " has " + ResultEnum.Won);
		case 3:
			System.out.println("It's a " + ResultEnum.Tie);
		default:
			System.err.print("System Error");
		}

	}

	public void whoseTurn(int i) {
		switch (i) {
		case 1:
			System.out.println(player.getP1() + "'s Turn (" + Mark.X + "):");
		case 2:
			System.out.println(player.getP2() + "'s Turn (" + Mark.O + "):");
		}
	}

	@Override
	public void drawBoard(Cell[][] board) {
		// TODO Auto-generated method stub

		System.out.println("Board:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j].getMark());
			}
			System.out.println();
		}

	}

}
