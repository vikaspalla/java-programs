// types of interface 
//1.Normal 
//2.single abstract method - from 1.18 versio we have Functional interface & Lamida expression
//3.Marker Interface


// functional intrerface
package oops;
interface Sss 
{
	void show() ;
}
public class FunctionalInterface {
public static void main(String[]args) 
{
	Sss obj = () 	->	System.out.println("something") ; //Lamida expression
obj.show();
}
}
