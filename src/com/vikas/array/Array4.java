package com.vikas.array;

import java.util.Arrays;

public class Array4 {
public static void main(String...args) {
	int age[] =  { 1,2,3,4,5,6} ;
	System.out.println("using the loop");
	for (int i = 0 ; i < age.length ; i++) {
		System.out.println(i);
		int[] nums={6,-1,-2,-3,0,1,2,3,4};
	
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);

//		int[] myArray = {23, 92, 56, 39, 93};
//    MinAndMax m = new MinAndMax();
//    System.out.println("Maximum value in the array is::"+m.max(myArray));
//    System.out.println("Minimum value in the array is::"+m.min(myArray));

}
	
}
}
