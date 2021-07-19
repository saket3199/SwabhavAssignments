package com.techlab.Person;

public class Person1 {
	private String name;
	private int age;
	private Gender gender;
	private static float weight;
	private float height;

	public Person1(String name, int age, Gender gender, float weight, float height) {
		if (name.isEmpty()) {
			this.name = "Unspecified";
		} else {
			this.name = name;
		}
		this.age = age;
		this.gender = gender;
		Person1.weight = weight;
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

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

	public void doWorkOut() {
		float w = weight-(weight*20/100);
		weight=w;
	}
	public void doEat() {
		float w = weight+(weight*5/100);
		weight = w;
	}
}
