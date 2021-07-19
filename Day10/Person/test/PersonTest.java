package com.techlab.Person.test;

import com.techlab.Person.Gender;
import com.techlab.Person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Apple", 21, Gender.MALE, 72, 196);
		Person person2 = new Person("Zebra", 20, Gender.FEMALE, 65, 165);
		System.out.println("The details of the Persons are: ");
		System.out.println("Name of the first Person is "+person1.getName()+" age is "+person1.getAge()
		+" gender is "+person1.getGender()+" weight is "+person1.getWeight()+
		" height is "+person1.getHeight()+" cm."
		);
		System.out.println("Name of the second Person is "+person2.getName()+" age is "+person2.getAge()
		+" gender is "+person2.getGender()+" weight is "+person2.getWeight()+
		" height is "+person2.getHeight()+" cm."
		);
	}

}
