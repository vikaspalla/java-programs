package com.vikas.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String... args) {

//		int arr[] = { 1, 2, 3, 4, 5, 6 };
//
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array :");

		int length = sc.nextInt();

		int arr2[] = new int[length];

		System.out.println("Please enter the " + length + " numbers");
		for (int i = 0; i < length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("output");
		for (int i = 0; i < length; i++) {

			System.out.print(arr2[i] + " ");
		}

	}

}
