package Assignments;

import java.util.Scanner;

public class Speed {
	public static  int speed(int distance , int time ) {
		
	int speed = distance / time ;
	return speed ; 
		
	}
 public static void main(String...args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the Distance ");
	 int distance = sc.nextInt();
	 System.out.println("Enter the Time ");
	 int time = sc.nextInt();
	 
	int speed = speed(distance , time );
	 System.out.print("speed is = ");
	 System.out.println(speed);
 }
}
