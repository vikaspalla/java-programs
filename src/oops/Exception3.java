package oops;
// Exception handling MuLtiple hand blocks
public class Exception3 {
	public static void main(String[] args) {
		try 
		{
			int a[] = new int[6];
			a[6] = 5 ;  // actually length is 5 only , so it is error 
			int i = 8 ;   // here there is no error , thats y its out put 4         
			int j = 2 ;
			int k = i/j ;
			System.out.println("output is "+ k);
		}
	catch (ArithmeticException  | ArrayIndexOutOfBoundsException i) 
		{
		System.out.println("error");
		}
	System.out.println("bye");
	}
}
