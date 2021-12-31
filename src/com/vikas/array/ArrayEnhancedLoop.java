package com.vikas.array;

public class ArrayEnhancedLoop {
public static void main(String[]args) {
	
	int d[] = {1,2,3,4,5,6} ;
	
	for (int i = 0 ; i<d.length ; i ++) {
		System.out.println(d[i]);
	}
	
	System.out.println();
	
	for ( int k : d) {
		System.out.println(k);
		
	}
	
	
}
}
