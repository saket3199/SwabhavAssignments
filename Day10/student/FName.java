package com.techlab.student;

import java.util.Comparator;

public class FName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getfName().compareTo(o2.getfName());
	}
}
