package oops;

public class Exception6 {
public static void main(String[]args) 
{
	int i , j ;
	i = 8 ;
	j= 9;
try {	
	int k = i/j ;
	if (k==0)
		throw new ArithmeticException();
	System.out.println(k);
}
	catch(ArithmeticException e)
{
	System.out.println("error");	
}
	
	
	
	
	 
	
	
}
}
