package com.vikas.array;

public class ArrayDuplicate {
public static void main (String...args) {
	String result = "" ; 
	int [] array = {1,2,3,4,2,3,5};
	for (int i = 0 ; i < array.length ; i ++) {
		for (int j = i+1 ; j< array.length ; j++) {
			if (array[i] == array[j]) {
//			System.out.println(array[i]);
		result=  result + array[i];
		
			}
			
			}
		
		
	}
	System.out.println(result);
	System.out.println(result.charAt(1));
	
	
	
}
}
