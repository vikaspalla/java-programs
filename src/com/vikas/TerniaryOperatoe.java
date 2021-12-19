package com.vikas;

import java.util.Scanner;

public class TerniaryOperatoe {
	public static void main(String...agrs) {
		int i = 8 ;
		int j = 0 ;
		if (i>7)
			j =1 ;
			else
				j= 2;	
		System.out.println(j);
		j = i>6?1:2;
		
		System.out.println(j);
			
				
		int vikas = 143;
		
		int vishal = 0;
		vishal = vikas>142?11:12;
		System.out.println(vishal);
	
		int num =2 ;
		int num1 = 5;
		int res ;
		System.out.println("first number:"+num);
		System.out.println("second number:"+num1);
		res = num>num1?num+num1:num-num1 ;
		System.out.println("max number is:"+res);
		
		int x,y;
		x=20;
		y= x>15?1:2;
		System.out.println("value of y is ="+y);
		y= x<35?15:16;
		System.out.println("value of y is ="+y);
				
		int c,d,e;
		c=10;
		d=20;
		e=30;
		int large= (c>d)?(c>e?c:e):(c>e?c:e);
		System.out.println("large="+large);
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter your marks");
		double marks = input.nextDouble();
		String result = (marks>40)? "pass" : "fail" ;
		System.out.println("you"+result+"the exam");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
	
	
		
