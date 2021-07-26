package com.project.tictactoe;

public class Players {
	private String P1;
	private String P2;
	private boolean Player1;
	private boolean Player2;
	public Players(String P1,String P2) {
		this.P1=P1;
		this.P2=P2;
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
