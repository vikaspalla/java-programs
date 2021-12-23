package Assignments;

import java.util.Scanner;

public class Factorial {
	public static void Factorial(int num) {
	int result = 1 ;
		for ( int i = num ; i>=1 ; i--) {
			 result = result * i ;
		}
		System.out.println(result);
		return;
	}
public static void main(String...args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the number ");
	int num = sc.nextInt();
	Factorial(num ) ;
	
	
}
}
