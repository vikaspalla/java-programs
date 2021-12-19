package com.vikas.tutorial;

import java.util.Scanner;

public class Multiplication {

	public static int multi(int a, int b) {

		int cross = a * b;
		return cross;

	}

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		System.out.println("enter the second numnber ");
		int b = sc.nextInt();

		int result = multi(a, b);
		System.out.println("mutliplication of given two numbers is = ");
		System.out.println(result);

	}

}
