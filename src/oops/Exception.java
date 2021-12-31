package oops;

public class Exception {

	public static void main(String[] args) {
		try 
		{
			int i = 9/0 ;
		}
	catch (ArithmeticException i) // using exception 10-13 , it can run shows output
		{
		System.out.println("error");
		}
	System.out.println("bye");
	}

}
