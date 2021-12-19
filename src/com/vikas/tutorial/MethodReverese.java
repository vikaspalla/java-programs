package com.vikas.tutorial;

import java.util.Scanner;

public class MethodReverese {

	public static int reverse(int a, int b) {

		int temp;
		temp = a;
		a = b;
		b = temp;
		
		return b;
	}

	public static void main(String... args) {

		int a = 1 ;
		int b = 2;
		int f= reverse(a, b);
		System.out.println(f);
	}
}
