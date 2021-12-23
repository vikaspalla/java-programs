package Assignments;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void leapyear(int year) {
		if ( year % 4 == 0  ) {
			System.out.println("yes it is leap year ");
		}
		else 
			System.out.println("no it is not leap year ");
		
	}
 public static void main (String...args) {
	 Scanner sc = new Scanner (System.in) ;
	 System.out.println("Enter the year ");
	 int year = sc.nextInt();
	 leapyear(year) ;
	 
 }
}
