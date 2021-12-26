package com.vikas.tutorial;

public class ArrayNonRepetating {

	public static void main(String[]args) {
		int intarray[] = { 6,2,5,1,5 } ;
		String result = "" ;
		for ( int i = 0 ; i < intarray.length ; i++ ) {
			int temp = 0; 
			for (  int j = 0 ;j<intarray.length ; j++ ) {
				if (i != j && intarray[i]==intarray[j]) {
					temp = 1 ;
					//break ;
					
				}
			}
			if (temp == 0) {
				result = result + intarray[i] ;

				System.out.println(intarray[i]);
			
			}
			
				
		}
		System.out.println();
		System.out.println(result);
		System.out.println(result.charAt(2));
	}
}
