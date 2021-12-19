package com.vikas.vishal;

import java.util.Scanner;

public class PrimeNumber {
	public static void prime(int num) {

		if (num == 2) {
			System.out.println(num + " is a prime number");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // take no = 7 , 7%2=1 , 7%3=1 , 7%4= 3 , 7%5 = 2 , 7%6 = 1
				System.out.println(num + " is not  a prime number");
				return;
			}
		}

		System.out.println(num + " is a prime number");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		prime(num);

	}
}
