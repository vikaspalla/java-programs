package com.Collections;

public class Address {
	
	private int pinCode;
	
	private String street;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String street) {
		super();
		this.pinCode = pinCode;
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", street=" + street + "]";
	}
	
	
	

}
