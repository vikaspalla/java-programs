package oops;

public class WrapperClass {
public static void main(String[]args) {
	
	int i = 5; // primative data type  // this saying value i is 5
	
	Integer ii = new Integer(i);  // wrapper class - it is also called 5
	//putting varaibles in object is called boxing or wraping
	//Integer ii = new Integer(5); //  - Boxing or Wrapping 
      int j = ii.intValue();  // UnBoxing and Unwrapping 

Integer value = i ; // AutoBoxing 
int k = value ;      // autounboxing 

System.out.println(k);
System.out.println(j);

String str = "123" ;
int n = Integer.parseInt(str);

System.out.println(n );







}
}
