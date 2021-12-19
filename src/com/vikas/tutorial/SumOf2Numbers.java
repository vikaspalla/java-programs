package com.vikas.tutorial;

public class SumOf2Numbers {
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
		
		
		
	}

	public static void main(String... args) {
		int a = 6;
		int b = 7;
		int vikas = sum(a, b);
		System.out.println(vikas);
		
		sumk(a,b);
		return;
		
	}
	public static void sumk(int a , int b) {
		System.out.println(a+b);
	}
}
