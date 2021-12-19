package com.vikas.tutorial;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.nextLine();
		String result = "";
		
		int lastIndex = input.length() - 1;
		
		for (int i = lastIndex; i >= 0; i--) {
			result = result + input.charAt(i);
		}
		
		System.out.println("Reversed String :" + result);
		sc.close();
	}

}
