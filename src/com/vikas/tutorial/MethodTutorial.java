package com.vikas.tutorial;

public class MethodTutorial {
	

	public static int sum(int a, int c) {
		int result = a + c;
		return result;
	}

	public static float sumFlaot(float a, float b) {
		float result = a + b;
		return result;
	}
	
	public static void main(String[] args) {
		int a =2 ;
		int c = 3;
		int vik = sum(a,c);
		System.out.println(vik);
		
		float num1 =2.4f;
		float num2 = 4.6f;
		
		float res = sumFlaot(num1, num2);
		System.out.println(res);
		
	}
	
	public static void sumVoid(int a, int c) {
		System.out.println(a+ c);
	}
	
}
