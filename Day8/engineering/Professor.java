package com.techlab.engineering;

public class Professor extends Person {
	private double salary;

	public Professor(int id, String name, String dob, double salary) {
		super(id, name, dob);
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}
}
