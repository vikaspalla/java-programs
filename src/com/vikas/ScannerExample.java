package com.vikas;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int m=sc.nextInt();
		
		if (m>6) {
			System.out.println("vikas");
		}
		else {
			System.out.println("vishal");

		}
		sc.close();
	}
}
