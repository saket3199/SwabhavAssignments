package com.project.tictactoe;

public class Player {
	private static String P1;
	private static String P2;
	private static boolean Player1;
	private static boolean Player2;
	public Player(String P1,String P2) {
		Player.P1=P1;
		Player.P2=P2;
	}
	public Player() {
		
	}
	public String getP1() {
		return P1;
	}
	public String getP2() {
		return P2;
	}
	public boolean isPlayer1() {
		return Player1;
	}
	public void setPlayer1(boolean player1) {
		Player1 = player1;
	}
	public boolean isPlayer2() {
		return Player2;
	}
	public void setPlayer2(boolean player2) {
		Player2 = player2;
	}
	
	

}
