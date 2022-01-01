package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class MainCustomerClass {

	public static void main(String[] args) {

		Address address = null;

		Customer customer = null;
		List<Customer> customers = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			customer = new Customer();
			address = new Address();
			customer.setAge(i);
			customer.setGender(i % 2 == 0 ? "male" : "female");
			customer.setName("customer_" + i);
			customer.setNumber(System.currentTimeMillis());

			address.setPinCode(i);
			address.setStreet("Peenarpalem");

			customer.setAddress(address);
			customers.add(customer);
		}

		for (Customer c : customers) {
			System.out.println(c);
		}

	}

}
