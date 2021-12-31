package com.vikas.array;

public class varargs {
	public static void main(String[] args) {

		Calc obj = new Calc();
		obj.add(5, 6, 7, 8, 9, 10, 11, 12);

		System.out.println(obj.add(5, 6, 7, 8, 9, 10, 11, 12));

	}
}

class Calc {

	public int add(int... i) { // three dots makes it an array
		// called as variable length arguments
		int sum = 0;
		for (int k : i) {
			sum = sum + k;
		}
		return sum;
	}
}
