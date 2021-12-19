package com.vikas.vishal;

import java.util.Scanner;

public class StringTutorial {
	
	public static void main(String[] args) {
		
		String name = "my name is vishal";
		String a = "    ";
		String name2 = "  vikas  ";
		String b = "vikas";
		String c = "VIKAS";
		
			System.out.println(name.length());
	
			System.out.println(name.charAt(16));
			System.out.println(name.indexOf('a'));
			System.out.println(name.lastIndexOf('a'));
			System.out.println(name.substring(3));
			System.out.println(name.substring(3, 7));
			
			System.out.println(name.replace(" ", ""));
			System.out.println(name.contains("vishal"));
			System.out.println(name.isEmpty());
			System.out.println(a.length());
			System.out.println(a.isEmpty());
			System.out.println(name2.trim());
			System.out.println(name.concat(name2));
			System.out.println(name + name2);
			System.out.println(b.equals(c) );
			System.out.println(b.equalsIgnoreCase(c));
			System.out.println(name.toUpperCase());
			
			String arr[] = name.split(" ");
			
			for(int i = 0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		
		
	}

}
