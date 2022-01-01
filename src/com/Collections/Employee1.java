package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee obj1 = new Employee("kumari", 50000, "female", 25);
		Employee obj2 = new Employee("sudhakar", 60000, "male", 26);
		Employee obj3 = new Employee("harisitha", 70000, "female", 27);
		Employee obj4 = new Employee("vikas", 80000, "male", 28);
		Employee obj5 = new Employee("vishal", 90000, "male", 29);

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);

		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("====================================");

		for (Employee e : list) {
			if (e.getGender().equals("male")) {
				System.out.println(e.getName());
			}
		}
		System.out.println("====================================");

		for (Employee e : list) {
			if (e.getGender().equals("female")) {
				System.out.println(e.getName());
			}
		}
		System.out.println("====================================");

		for (Employee e : list) {
			if (e.getSalary() < 70000 && e.getGender().equals("male")) {
				System.out.println(e.getName());
			}
		}

		System.out.println("====================================");
		for (Employee e : list) {
			if (e.getSalary() < 70000 && e.getAge() < 28) {
				System.out.println(e.getName());
			}
		}
		System.out.println("====================================");
		for (Employee e : list) {
			if (e.getAge() < 27 || e.getGender().equals("male")) {
				System.out.println(e.getName());
			}
		}
		System.out.println("====================================");

	}

}
