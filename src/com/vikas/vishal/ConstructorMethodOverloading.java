package com.vikas.vishal;

public class ConstructorMethodOverloading {
	public static void main(String[] args) {
		Methodoverload obj = new Methodoverload();
		obj.add(5, 6);
		int res = obj.add(5, 6, 7);
		System.out.println("Res" + res);
		obj.add(5.5, 6.6, 7.7);
		System.out.println();
	}
}

class Methodoverload {

	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public int add(int i, int j, int k) {
		return i+j+k;
	}

	public void add(double i, double j, double k) {
		System.out.println(i + j + k);

	}
}