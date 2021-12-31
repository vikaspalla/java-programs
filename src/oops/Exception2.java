package oops;

public class Exception2 {
	public static void main(String[] args) {
		try 
		{
			int i = 8 ;   // here there is no error , thats y its out put 4         
			int j = 2 ;
			int k = i/j ;
			System.out.println("output is "+ k);
		}
	catch (ArithmeticException i) 
		{
		System.out.println("error");
		}
finally 
{
	System.out.println("bye");
}
	}
}
