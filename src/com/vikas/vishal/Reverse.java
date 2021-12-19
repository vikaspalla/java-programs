package com.vikas.vishal;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String...args) {
		
		Scanner sc = new Scanner(System.in) ;
		int num= sc.nextInt();
//		int num= 1234;

		int rem=0 ;
		int rev =0;
	
		while(num>0) //1234 //123 //12 //1
		{
			rem = num%10; //4   // 3 //2 //1
			num = num/10;  //123    //12 //1 //0
			rev= rev*10 +rem ; //0*10+ 4 = 4 //43 //432 //4321
			
		}
			System.out.println(rev); 	
				
		}
		
		
	}


