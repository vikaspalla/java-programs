package com.vikas.array;

import java.util.Scanner;

public class Array2d1 {
	public static void main(String[] args) {
		int  arr[][] = new int [3][3] ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length ");
				 
		for(int i = 0 ; i<arr.length ; i++) {
			for (int j = 0 ; j<arr.length ; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
			
				
				System.out.print(arr[i] [j] + " ");
			}
			System.out.println();
		
		
//		int d[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
//		System.out.println(d.length);
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print(" " + d[i][j]);
//			}
//			System.out.println();
//		}
	}
}
}