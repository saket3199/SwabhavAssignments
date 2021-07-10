package com.techlab.Player;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void whoISElder(Player[] elder) {

		int temp = elder[0].getAge();
		String name = elder[0].getName();
		for (int i = 1; i < elder.length; i++) {
			if (temp < elder[i].getAge())
				temp = elder[i].getAge();
				name = elder[i].getName();
		}
		System.out.println(name+" is elder with age of " + temp);

	}
}
