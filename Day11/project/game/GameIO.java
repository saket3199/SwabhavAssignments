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
	private Scanner input;
	private Game game;

	public GameIO() {
		input = new Scanner(System.in);
		game = new Game(boardSize());
	}
public int boardSize() {
	System.out.println("Enter Board Size");
	return this.size=input.nextInt();
}
	public void getUserName() {
		
		System.out.println("Let's play Tic Tac Toe!");
		System.out.print("Player 1, what is your name? ");
		String p1 = input.nextLine();
		System.out.print("Player 2, what is your name? ");
		String p2 = input.nextLine();
		player = new Player(p1, p2);
		player.setPlayer1(true);

	}
	public void boardValidator(int i) {
		switch(i) {
		case 1:
			System.out.println("This position is off the bounds of the board! Try again.");
		case 2:
			System.out.println("Someone has already made a move at this position! Try again.");
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

	public void printResult(String name,int i) {
		switch (i) {
		case 1:
			System.out.println(name + " has " + ResultEnum.Won);
		case 0:
			System.out.println("It's a " + ResultEnum.Tie);
		default:
			System.err.print("System Error");
		}

	}
	public void whoseTurn(String name,int i) {
		switch(i) {
		case 1:
			System.out.println(name + "'s Turn (" + Mark.X + "):");
		case 2:
			System.out.println(name + "'s Turn (" + Mark.O + "):");
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
