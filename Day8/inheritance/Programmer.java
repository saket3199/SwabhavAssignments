package com.techlab.single.inheritance;

public class Programmer extends Employee {
	private float bonus;

	public Programmer(int id, String name,double salary, float bonus) {
		super(id, name, salary + bonus);
		this.bonus = bonus;

	}

	public float getBonus() {
		return bonus;
	}

}
