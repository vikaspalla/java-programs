package com.vikas;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String... agrs) {
		System.out.println("please tell number");

		Scanner sc = new Scanner(System.in);
		float m = sc.nextFloat();
		if (m > 3) {
			System.out.println("it is greater than three");
		} else {
			System.out.println("it is not greater than three");

		}
	}

}
