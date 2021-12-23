package Assignments;

import java.util.Scanner;

public abstract class InchesToMeters {
	public static void main(String...args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The InchesValue");	
		int a = sc.nextInt() ;
		inches(a);
		
		
	}
	public static void inches(int a) {
		double metres = a * 0.0254 ; 
		System.out.print(metres);
	}
	
	
	
	
	
	

}
