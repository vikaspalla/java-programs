package oops;
 class Afinal 
{
	// public final void show()  // if i put final here , no one can overide my method
	{
		System.out.println("vikas ");
	}
}
class Bfinal extends Afinal
{
	public void show() 
	{
		System.out.println("vishal");
	}
}
public class Finalclass1 {
public static void main() {
	Bfinal obj = new Bfinal();
	obj.show() ;


}
}
