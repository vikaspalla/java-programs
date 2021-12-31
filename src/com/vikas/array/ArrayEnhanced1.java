package com.vikas.array;

public class ArrayEnhanced1 {
public static void main(String[]args) {

	int d[][] = { 
			     { 1, 2, 3, 4, 5 },
			    { 6, 7, 8, 9, 10 } ,
	            {11 ,12,13,14,15,16}
	            };
	
	for (int i = 0; i < d.length; i++) {
		int sum = 0 ;
		for (int j = 0; j < d[i].length; j++) {
                   sum = sum + d[i][j];
			
                   System.out.print(" " + d[i][j]);
		}
		System.out.println (" sum of row is = "+sum);
		System.out.println();
	}
	
	int sum =0 ;
	for (int k[] : d) {
		for (int l : k) {
		sum+=l ;	
						//	System.out.print(" " + l);
		}
		System.out.println(sum);

		
		System.out.println();
	}
	



















}
	
}
