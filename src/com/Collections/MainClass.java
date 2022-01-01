package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student stu1 = new Student("vishal", "male", 25);
		Student stu2 = new Student();
		Student stu3 = new Student("ajith", "male", 33);
		Student stu4 = new Student("raju", "male", 19);
		Student stu5 = new Student("kavya", "female", 17);

		stu2.setName("vikas");
		stu2.setAge(25);
		stu2.setGender("male");
		

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);

		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println("=================================");

		for (Student s : list) {
			System.out.println(s.getName());
		}

		System.out.println("=================================");

		for (Student s : list) {
			if (s.getAge() < 20) {
				System.out.println(s.getName());
			}
		}
		System.out.println("=================================");

		for (Student s : list) {
			if (s.getAge() <20 && s.getGender().equals("female") ) {
				System.out.println(s.getName());
			}
		}
		System.out.println("=================================");

		for(Student s : list) 
		{
			if (s.getAge() >20 && s.getGender().equals("male")) 
			{
				System.out.println(s.getName());
			}
		}
	}

}
