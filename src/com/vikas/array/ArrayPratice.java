package com.vikas.array;

public class ArrayPratice {
 public static void main(String[]args) {
	 int d[][] = {
			 {1,2,3}, 
			 {4,5,6},
			 {7,8,9}
			 } ;
	 for (int i = 0 ; i<3 ; i ++) {
	//	 int sum = 0 ;
		 for (int j = 0 ; j<3 ; j++) {
//			sum = sum + d[i][j];
			if (i ==j  ) {
				//System.out.println();
			System.out.print(" "+ d[i][j]);	
			}
			
//			 System.out.println(" "+ d[i][j]);
		 } 	
	 
		 
	 }System.out.println();
	 for (int i = 0 ; i<3 ; i ++) {
				 for (int j = 0 ; j<3 ; j++) {
					if ((d.length-1)== i+j) {
		//	System.out.println();
					System.out.print(" "+d[i][j]);	
					}
				 } 	
			 }
 }
}
