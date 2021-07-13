package com.techlab.engineering;

public class Student extends Person {
	private String branch;
	public Student(int id, String address, String dob, String branch)
	{
		super(id,address,dob);
		this.branch=branch;
	}
	public String getBranch()
	{
		return branch;
	}

}
