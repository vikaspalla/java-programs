package Assignments;

import java.util.Scanner;

public class Table {
public static void main(String...args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("entre the  table number ");
	int num = sc.nextInt();
	
	for ( int i = 1 ; i<= 12 ; i++) {
		
		System.out.println(+num +" x " + i +   " = "  + num*i );
		
		
	}
	
}
}
