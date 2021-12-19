package com.vikas.vishal;

import java.util.Scanner;

public class SumOfNatrualnumbers {
	public static void sumofnatural(int num) {
		int res = 0;
		for (int i = 1; i <= num; i++) {
			
			res = res + i;
		}
		System.out.println(res);

	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value ");
		int num = sc.nextInt();
		sumofnatural(num);

	}

}
