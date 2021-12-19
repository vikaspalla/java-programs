package com.vikas;

public class IfElse {
public static void main(String...args) {
	int n=15 ;
	 if(n==1)
	 {
		 System.out.println("nothing");
	 System.out.println("bye");                         // if we dont put curly brackets then error shows because "if" is only or nothing statement , not for "bye"
	 }
	 else if(n%2==0)
			 System.out.println("even");
		 else
			 System.out.println("odd");
}
}
