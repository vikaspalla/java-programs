package com.collections1;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
	int rollno, marks;
	String name;

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	public int compareTo(Student s) {
		return marks > s.marks ? 1 : -1;
	}
}

public class Collections3 {
	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(23, "Mahesh", 55));
		studs.add(new Student(24, "Sony", 65));
		studs.add(new Student(25, "vikas", 70));
		studs.add(new Student(26, "vishal", 75));

		// Collections.sort(studs);

		for (Student s : studs) {
			System.out.println(s);
		}
	}
}
