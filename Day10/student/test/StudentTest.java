package com.techlab.student.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlab.student.FName;
import com.techlab.student.LName;
import com.techlab.student.RollNo;
import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Apple", "zebra"));
		studentList.add(new Student(4, "Banana", "yatch"));
		studentList.add(new Student(2, "Cat", "Xmas"));
		studentList.add(new Student(5, "Dog", "Watch"));
		studentList.add(new Student(3, "Elephant", "van"));
		System.out.println(studentList);
		Collections.sort(studentList,new RollNo());
		System.out.println(studentList);
		Collections.sort(studentList);//Natural Ordering Using Comparable
		System.out.println(studentList);
		Collections.sort(studentList,new LName());
		System.out.println(studentList);
		
	}

}
