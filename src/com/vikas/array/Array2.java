package com.vikas.array;

import java.util.Scanner;

public class Array2 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");

		int length = sc.nextInt();

		int[] nums = new int[length];

		System.out.println("Please enter the " + length + " numbers");

		for (int i = 0; i < length; i++) {

			nums[i] = sc.nextInt();
		}
		System.out.println("output");

		for (int i = 0; i < length; i++) {

			System.out.print(nums[i] + " ");
		}

	}
}
