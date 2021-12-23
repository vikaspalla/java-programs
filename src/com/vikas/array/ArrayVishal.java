package com.vikas.array;

public class ArrayVishal {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 10, 7, 88 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0 ; j<arr.length; j++) {
				int temp = 0;
				if(arr[i] != arr[j]) {
					if(arr[i]<arr[j]) {
						temp = 1;
					}
					
//					if( arr[i] != arr[j] && temp == 0 && count == arr.length-1) {
//						System.out.println(arr[j] + " is the highest in array");
//						return;
//					}
				}
				count ++;
				if( arr[i] != arr[j] && temp == 0  && count == arr.length-1) {
					System.out.println(arr[j] + " is the highest in array");
					return;
				}
				
			}
		}

	}
}
