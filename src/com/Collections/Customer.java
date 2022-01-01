package com.Collections;

public class Customer {

	private String name;

	private String gender;

	private int age;

	private long number;

	private Address address;

	public Customer() {
		super();
	}

	public Customer(String name, String gender, int age, long number, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.number = number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", number=" + number + ", address="
				+ address + "]";
	}
	
	

}
