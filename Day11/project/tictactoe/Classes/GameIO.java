package com.project.tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.tictactoe.ResultEnum;

public class GameIO implements IGameioable {
	private int size;
	private Player player;
	private Scanner input;

	public GameIO(int size) {
		this.size = size;
		input = new Scanner(System.in);
		new Board(size);
		new ResultAnalyzer(size);

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
