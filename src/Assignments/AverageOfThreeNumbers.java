package Assignments;

import java.util.Scanner;

public class AverageOfThreeNumbers {
	public static void AverageOfThreeNumbers(int a , int b , int c ) {
		
		double result = (a+b+c)/3 ;
		System.out.print("Average of 3 numbers is = ");
		System.out.println();
		System.out.println(result);
		
		
	}
	
public static void main(String...args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter 1st number ");
	int a = sc.nextInt();
	System.out.println("enter 2nd number ");
	int b = sc.nextInt();
	System.out.println("enter 3rd number ");
	int c = sc.nextInt();
	
	AverageOfThreeNumbers(a , b , c ) ;
}
}
