package com.techlab.student;

import java.util.Comparator;

public class LName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getlName().compareTo(o2.getlName());
	}
}
