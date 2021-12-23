package Assignments;

import java.util.Scanner;

public class Percentage360Of500 {
	public static void Percentage360Of500(double marks , double total ) {
		double percentage =  (marks/total) *100 ;
		System.out.println();
		System.out.print("percentage obtained is =" + percentage);
		
		
		
	}
	
 public static void main(String...args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter the marks obtained in exam ");
	 double marks = sc.nextInt();
	 System.out.println("enter the total marks ");
	 double total = sc.nextInt();
	 Percentage360Of500(marks , total );
	 
 }
}
