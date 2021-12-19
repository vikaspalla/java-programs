package com.vikas.vishal;

import java.util.Scanner;

public class Multiplicationof7table {
	public static void seventable(int num) {
		for (int i = 1 ; i<=12 ; i++)
		{
			System.out.println(+num +" x " + i +   " = "  + num*i);
		
		}		
		
	}
	
	public static void main(String...args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		
			System.out.println("Enter the number");
			int num = sc.nextInt();
	    seventable(num);
			
		
		
		
		
	}

}
