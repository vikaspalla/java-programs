package Assignments;

import java.util.Scanner;

public class Array {
public static void main(String...args) {
	
	Scanner sc = new Scanner(System.in);
	int array[] = new int[5] ;
	int sum = 0 ;
	for (int i = 0 ; i <5 ; i++) {
		array[i] = sc.nextInt();
		
	}
	for (int i = 0 ; i < 5 ; i++) {
		sum = sum + array[i] ;
		
	}
	System.out.println(sum);
	System.out.println(sum/5);
}
}
