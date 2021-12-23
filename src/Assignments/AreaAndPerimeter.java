package Assignments;

import java.util.Scanner;

public class AreaAndPerimeter {
	public static void AreaAndPerimeter(int radius) {
		double phi = 3.14159d ;
		
		double area = phi * (radius*radius) ;
		System.out.println("Area of Circle is = " + area);
		double perimeter = 2*phi*radius ;
		System.out.println("Perimeter of circle is = " + perimeter);
		
		
		
	}
public static void main(String...args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the radius  of circle");
	int radius = sc.nextInt() ;
	 AreaAndPerimeter(radius);	
	
	
	
}
		
}
