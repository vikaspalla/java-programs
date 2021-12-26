package com.vikas.array;

public class ArrayVishal2 {
	
	
	public static void main(String[] args) {
//		int arr[] = { 2, 3, 10, 7, 88 };
//		int arr2[] = new int[5];
//		int count = 0;
//		for(int i = arr.length-1; i >=0; i--) {
//			arr2[count] = arr[i];
//			count++;
//		}
//		count = 0;
//		for(int i = 0; i<arr2.length; i++) {
//			arr[count] = arr2[i];
//			count++;
//		}
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+ "  ");
//		}
//	
	int arr[] = { 2 , 3 , 10 , 7 , 88 } ;
	int arr2[] = new int[5] ;
	int count = 0 ;
	for( int i = arr.length-1 ; i >=0 ; i--) {
	  arr2[count] =  arr[i] ;
	  count ++ ;
	}
	count = 0 ;
	for (int i =0 ; i<arr2.length ; i++) {
		arr[count]=arr2[i];
		count ++;
	}
	for (int i = 0 ; i<arr.length; i++ ) {
		System.out.print(arr[i]+ " , ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
