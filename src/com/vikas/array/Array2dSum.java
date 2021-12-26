package com.vikas.array;

import java.util.Scanner;

public class Array2dSum {

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
			int sum = 0 ; 
			for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[i] [j] ;
				
//				System.out.print(arr[i] [j] + " ");
			}
			System.out.println(sum);
			System.out.println();

	}
}

}
