package oops;

public class Exception5 {
	public static void main(String[] args) {
		try 
		{
			int a[] = null ; 
			a[6] = 5 ;   
			int i = 8 ;            
			int j = 0 ;
			int k = i/j ;
			System.out.println("output is "+ k);
		}
	catch (ArithmeticException i) 
		{
		System.out.println("cannot divide");
		}
catch (ArrayIndexOutOfBoundsException i ) 
		{
		System.out.println("stay in ur limit");
		}
	//	catch (Exception e) 
	//	{
	//		System.out.println("null");
	//	}
		finally {
			System.out.println("bye");
		}
	}
}
