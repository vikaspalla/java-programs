package Assignments;

import java.util.Scanner;

public class ReverseOfNumber {
public static void main(String...args) {
	Scanner sc = new Scanner (System.in) ;
	System.out.println("enter the number ");
	int num = sc.nextInt() ;
	int	remiander = 0 ;
	
	while ( num !=0 ) {
	int remainder = num % 10 ;
	int sum = 0 ;
	 sum = sum*10 + remainder ; 
	num = num /10 ;
		System.out.print(sum);
	}
//	for (int  i = 0 ; i <num  ; i++) {
//		int remainder = num % 10 ;
//		int sum = 0 ;
//		 sum = sum*10 + remainder ; 
//		num = num /10 ;
//			System.out.print(sum);
//		}
	
	
}
}
