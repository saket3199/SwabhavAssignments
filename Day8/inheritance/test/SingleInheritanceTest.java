package com.techlab.single.inheritance.test;

import com.techlab.single.inheritance.Employee;
import com.techlab.single.inheritance.Programmer;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer(1, "apple", 8000, 2500);
		System.out.println("id = " + p.getId() + " name = " + p.getName() + " Salary = " + p.getSalary() + " Bonus = "
				+ p.getBonus());

		
	}
}