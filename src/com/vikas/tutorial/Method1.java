package com.vikas.tutorial;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the number");
		int a = sc.nextInt();
		int res = sum(a);
		System.out.print("answer is  = ");
		System.out.print(res);
	}

	public static int sum(int a) {
		int res = a + a;

		return res;

	}

}
