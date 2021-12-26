package com.vikas.array;

import java.util.Scanner;

public class ArrayDiagonal {
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
		 String result = "" ;
			for (int j = 0; j < arr.length; j++) {
			if (  i == j || ((arr.length-1)== i+j ) )
					{
				System.out.println(arr[i][j]);
			}
			
			
			}
//			System.out.print(result + " ");
//			System.out.println();

	}
}
}
