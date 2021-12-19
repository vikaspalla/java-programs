package com.vikas.vishal;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		int num = 367;
		
		int temp = num;
		int a;	
		
		while(temp>0) {
			
			a = temp % 10; // 367%10 = 7    , 36%10= 6   , 3%10 = 3
			temp = temp/10;  // 367/10 = 36 , 36/10 = 3  ' 3/10 = 0
			System.out.print(a); // 7       , 6 , 
		}
		
	}
}
