package com.vikas.vishal;

public class Stringname {
	public static void main(String...args) {
		String n = "vikas      ";
		String name = "my name is vikas" ;
		String str = "FLM" ;
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 7));
		
		System.out.println(name.replace(" ", ""));
		System.out.println(name.contains("vikas"));
		System.out.println(name.isEmpty());
		System.out.println(n.trim());
		System.out.println(name.contains(n));
		System.out.println(name + n);
		System.out.println(name.toUpperCase());
	}
	
	
	

}
