package com.vikas.tutorial;

import java.util.Scanner;

public class ScannerMethod {

	public static int nextInt(int a, int b) {

		int temp;
		temp = a;
		a = b;
		b = temp;
		return b;
	}

	public static void main(String... args) {
		int a = 0;
		int b = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		a = sc.nextInt();
		System.out.println("enter the second number");

		b = sc.nextInt();
System.out.println("changes number is ");
		System.out.println(nextInt(a, b));

	}

}
