package com.vikas.vishal;

import java.util.Scanner;

public class PrintOnlyEvenNumbers1000 {
	public static void even(int n) {

		for (int num = 1; num <= 1000; num++) {

			if (num % 2 == 0) {
				System.out.print(num + ",");
			}
		}

	}

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		  even(a);

	}

}
