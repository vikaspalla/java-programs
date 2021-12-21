package com.vikas.vishal;

import java.util.Scanner;

public class PrimeNumberNew {
	public static void main (String...args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num = sc.nextInt() ;
		prime(num);
	}
		

	public static void prime(int num) {
			if (num ==2 ) {
				System.out.println("prime number");
			return;
			}	  
		for (int  i =2 ; i < num ; i++) {
			if (num%i == 0 ) {
				System.out.println("not prime number");
				return ;	
			}
			
		}
			for (int  i =1 ; i < num ; i++) {
				if (num%i!= 0);
				System.out.println("prime number");
				return ;
			}
		}
		
}


		
	
	
	
	
	
	
	
	


