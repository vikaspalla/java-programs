package Assignments;

import java.util.Scanner;

public class SwapTwoNumbers {
   public static void main(String...args) {
	   Scanner sc = new Scanner(System.in);
	 System.out.println("enter the 1st number");
	   int a = sc.nextInt() ;
	System.out.println("enter the second number");
	   int b = sc.nextInt() ;
	   swap(a, b);
	 
	  
	   
	   
   }
   public static void swap(int a , int b ) {
	   int temp = 0;
	   temp = a;
	   a = b ;
	   b = temp ;
	   
	 System.out.print("swaped numbers is = ");  
	System.out.println();
	 System.out.println("a = " + a);
	 System.out.println("b = " + b);
   }

	
	
}
