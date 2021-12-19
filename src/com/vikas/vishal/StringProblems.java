package com.vikas.vishal;

import java.util.Scanner;

public class StringProblems {

	public static void main(String...args) {
		String name = "Umbrella" ;
		String n = "orange juice" ;
		System.out.println(name.contains("e"));           // name contains "e"
		System.out.println(n.contains("orange"));			// n contains "orange" 
			String n1 = "123" ;
			int i = Integer.parseInt(n1) ;
			System.out.println(i+ "50");
			System.out.println(i+ 50 );
			String valueOf = String.valueOf(23);
			String value = ""+23;
System.out.println(valueOf);
		System.out.println(name.toUpperCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		       string(input);
		
		
		
	}
	public static void string(String input) {
		String result = "" ;
		
		int lastIndex = input.length() - 1;
		
		for ( int i = lastIndex ; i>=0 ; i-- ) 
		{
			
			result = result + input.charAt(i);
			
		}
		System.out.println(result);
	}
	
}
