package Assignments;

import java.util.Scanner;

public class Discount {
	public static void main(String...args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(" enter the no of items u want to buy ");
    int items = sc.nextInt() ;
    System.out.println("enter the amount ");
		int amount = sc.nextInt();
		
	if (  items <=100 ) {
       
       System.out.println("selling price is = " + amount * 0.9 );
	return;}
	if (items >= 100 && items <= 200 ) {
		System.out.println("selling price is = " + amount * 0.8);
	return ;}
	if ( items > 300 ) {
		System.out.println(" selling price is = " + amount *0.7 );
		return ;
	}
	} 

}
