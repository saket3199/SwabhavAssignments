package com.project.tictactoe;

public class Player {
	private static String p1;
	private static String p2;
	private static boolean player1;
	private static boolean player2;
	public Player(String P1,String P2) {
		Player.p1=P1;
		Player.p2=P2;
	}
	public Player() {
		
	}
	public String getP1() {
		return p1;
	}
	public String getP2() {
		return p2;
	}
	public boolean isPlayer1() {
		return player1;
	}
	public void setPlayer1(boolean player1) {
		Player.player1 = player1;
	}
	public boolean isPlayer2() {
		return player2;
	}
	public void setPlayer2(boolean player2) {
		Player.player2 = player2;
	}
	
	

}
