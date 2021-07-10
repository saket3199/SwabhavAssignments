package com.techlab.Player.test;

import com.techlab.Player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player[] p = new Player[4];
		Player p1 = new Player(1, "Saket", 20);
		p[0] = p1;
		Player p2 = new Player(2, "Apple", 21);
		p[1] = p2;
		Player p3 = new Player(3, "Orange", 22);
		p[2] = p3;
		Player p4 = new Player(4, "Grapes", 23);
		p[3] = p4;
		p4.whoISElder(p);
		printPlayerInfo(p);
	}

	public static void printPlayerInfo(Player[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.print("\n");
			System.out.println("ID of " + (i + 1) + " Player is : " + info[i].getId());
			System.out.println("Name of " + (i + 1) + " Player is : " + info[i].getName());
			System.out.println("Age of " + (i + 1) + " Player is : " + info[i].getAge());
		}
	}
}
