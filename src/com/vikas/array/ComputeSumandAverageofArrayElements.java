package com.vikas.array;

public class ComputeSumandAverageofArrayElements {
	 public static void main(String...args ) {
  	   
//  	   int nums[] = new int [4] ;
//  	 int sum = 0 ;
//  	   for (int i = 0 ; i < 4 ; i++) {
//  		   sum = sum + i ;
//  	   }
//  	
//  	   System.out.println(sum);
//  	 
//  		 float   average =  sum / 4  ;
//  		 System.out.println(average);
  	 
  		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
  	   int sum = 0;
  	   Double average;
  	   
  	   // access all elements using for each loop
  	   // add each element in sum
  	   for (int number: numbers) {
  	     sum += number;
  	   }
  	  
  	   // get the total number of elements
  	   int arrayLength = numbers.length;

  	   // calculate the average
  	   // convert the average from int to double
  	   average =  ((double)sum / (double)arrayLength);

  	   System.out.println("Sum = " + sum);
  	   System.out.println("Average = " + average);
	 }
     }	
	

      

