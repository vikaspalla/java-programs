package com.Collections;

public class Employee {
private String name ;
private int salary;
public String gender ;
private int age ;
public Employee() {
	super();
}
public Employee(String name, int salary, String gender, int age) {
	super();
	this.name = name;
	this.salary = salary;
	this.gender = gender;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + ", age=" + age + "]";
}

}
