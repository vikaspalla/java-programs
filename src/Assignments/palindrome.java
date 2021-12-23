package Assignments;

import java.util.Scanner;

public class palindrome {
	
	public static void palindrome(int number ) {
	 

 int sum = 0 , remainder = 0 , temp ;
 temp = number ;
 
 while ( number  > 0  ) {
        remainder = number % 10 ;
		sum = sum *10 +  remainder ;
		number = number /10 ;
 }
		if (temp == sum ) {
			System.out.println(" it is palindrome number ");
		}
		else 
		{
			System.out.println(" it is not palindrome number ");
		}
	}
	
public static void main(String...args) {
	Scanner sc = new Scanner (System.in);
	System.out.println(" enter the palindrome number ");
	int number = sc.nextInt() ;
	palindrome(number);
	
	
}
}
