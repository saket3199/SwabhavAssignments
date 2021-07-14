package com.techlab.engineering.test;

import com.techlab.engineering.Professor;
import com.techlab.engineering.Student;

public class EngineeringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Kandivali", "31/07/1999","Computer Science");
		Professor p=new Professor(1,"Mumbai","31/07/1990",50000);
		p.setConveyance(0);
		p.setDearness_Allowance(0);
		p.setHRA_Allowance(0);
		p.setMedical_allowance(0);
		System.out.println("Id of Student = "+s.getId()+" Address = "+s.getAddress()+" DOB = "+s.getDOB()+" Branch = "+s.getBranch());
		System.out.println("Id of Professor = "+p.getId()+" Address = "+p.getAddress()+" DOB = "+p.getDOB()+" Basic Salary = "+p.getSalary()+" Total Salary = "+p.totalSalary());
	}

}
