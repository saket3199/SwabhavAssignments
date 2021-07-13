package com.techlab.single.inheritance.test;

import com.techlab.single.inheritance.Employee;
import com.techlab.single.inheritance.Programmer;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer(1, "apple", 8000, 2500);
		System.out.println("id = " + p.getId() + " name = " + p.getName() + " Salary = " + p.getSalary() + " Bonus = "
				+ p.getBonus());

		// UPCASTING
		Programmer p1 = new Programmer(2, "banana", 5000, 2000);
		Employee e = p1;
		System.out.println("Bonus of "+e.getName()+" is "+p1.getBonus());
		System.out.println("id = " + e.getId() + " name = " + e.getName() + " Salary = " + e.getSalary() + " bonus = "
				+ p1.getBonus());

		// DOWNCASTING
		Employee e1 = new Programmer(3, "grapes", 6000, 1500);
		Programmer p2 = (Programmer) e1;
		System.out.println("id = " + p2.getId() + " name = " + p2.getName() + " Salary = " + p2.getSalary()
				+ " bonus = " + p2.getBonus());

	}
}