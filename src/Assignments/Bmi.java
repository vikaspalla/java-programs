package Assignments;
import java.util.Scanner;

public class Bmi {
	private static void bmi(int height, int weight) {
		
	int	 result = weight / (height*height ) ;
		 System.out.println(result );}

	
	public static void main (String...args) {
	int height = 0;
	int weight = 0 ;
	Scanner sc = new Scanner(System.in) ;
	
	System.out.print("enter the height ");
	height = sc.nextInt() ;
	System.out.println("enter the weight ");
	weight =  sc.nextInt() ;
	
	
	 bmi( height ,weight );
	
	 



}
}
