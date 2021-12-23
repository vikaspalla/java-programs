package Assignments;

import java.util.Scanner;

public class fiveDigitNumberOrNot {
	public static void fiveDigitNumberOrNot(int num) {
		if ( num >=10000 && num <=99999) {
			System.out.print("Number is Five Digit ");
		}
		
			else {
				System.out.println("Number is Not Five Digit ");
			}
				
		}
		
	
public static void main (String...args) {
	Scanner sc = new Scanner(System.in) ; 
	System.out.println("Enter the number ");
	int num  = sc.nextInt();
	
	fiveDigitNumberOrNot(num) ;
	
	
}
}
