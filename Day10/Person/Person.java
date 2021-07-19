package com.techlab.Person;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	private double weight;
	private double height;

	public Person(String name, int age, Gender gender, double weight, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

}
