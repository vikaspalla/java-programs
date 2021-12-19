package com.vikas.vishal;

import java.util.Scanner;

public class ForLoop {

	public static int loop(int num) {
		for (int z = 1; z <= num; z++) {

			if (z % 2 == 0 && z % 5 == 0) {

				System.out.println(z);
			}

		}
		return num;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();

		int j = loop(a);
		System.out.println(j);
	}

}
