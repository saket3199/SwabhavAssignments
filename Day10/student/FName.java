package com.techlab.student;

public class FName implements Comparable<Student> {

//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getfName().compareTo(o2.getfName());
//	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getfName().compareTo(o.getfName());
	}
}
