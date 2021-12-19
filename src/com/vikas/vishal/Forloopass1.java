package com.vikas.vishal;

import java.util.Scanner;

public class Forloopass1 {
	public static void rever(int a) {

		int reverse = 0;
		while (a != 0) { // itera the process

			int digit = a % 10; // isolate the last digit number

			reverse = digit + (reverse * 10); // append last digit to reverse
			a = a / 10; // remove the last digit from number
		}
		System.out.println("reversed number is = ");
		System.out.println(reverse);

	}

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		rever(a);

	}

}
