package Assignments;

import java.util.Scanner;

public class CelsiusToForeignheat {
	
	public static int CelsiusToForeignheat(int celsius) {
		int Foreignheat  = (celsius * 9/5) + 32 ;
		return Foreignheat;
	}
	
public static void main(String...args) {
	Scanner sc = new Scanner(System.in);
	  System.out.println("enter the celsius value ");
	  int celsius = sc.nextInt() ;
	  
	  CelsiusToForeignheat(celsius);
	  System.out.println(CelsiusToForeignheat(celsius));
}
	



}
