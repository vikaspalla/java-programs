package oops;
interface Ccc
{
void show ();
}




public class AnonymousClassWithInterface {
public static void main(String[]args) 
{
	Ccc obj = new Ccc() 
	{
		public void show()
		{
		System.out.println("anything");
		}
	};
	obj.show();
}
}
