package com.vikas.array;

public class MinAndMax {
	public static void main(String...args) {
		
		int nums[] = {5,6,7,8,9,10,11} ;
		findMinAndMax (nums) ;
				
		
	}
	private static void findMinAndMax(int[] nums) {
		
		int max = nums[0] ;
		int min = nums[0] ;
		for ( int i = 1 ; i < nums.length ; i++) {
			if (nums[i] > max) {
				max = nums[i] ;
			}
			else if ( nums[i] <min ) {
				min = nums [i] ;
			}
		}
		System.out.println("minumum number in array is =" + min);
		System.out.println("maximum number in array is ="+ max);
		
	}
	public String max(int[] myArray) {
		// TODO Auto-generated method stub
		return null;
	}
	public String min(int[] myArray) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
