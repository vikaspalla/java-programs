package com.vikas.tutorial;

import java.util.Scanner;

public class Division {
public static int division (int a , int b)
{
	int divi = a/b ;
	return divi ;
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number 1");
	int a = sc.nextInt();
	System.out.println("enter the number 2");
	int b = sc.nextInt();
	System.out.println("answer is = ");
	int result = division(a,b);
	
	System.out.println(result);
	
}


}
