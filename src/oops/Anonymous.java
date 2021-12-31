package oops;
class Aaa 
{
public void show() 
{
	System.out.println("print A");
}	
}
// class Baa extends Aaa
//{
// public void show() 
// {
//	 System.out.println("print B ");
// }	
//}
public class Anonymous {
public static void main() 
{
	Aaa obj = new Aaa() 
	{
		public void show()             // so 21-24 is Anonymous class , which does
		 {                                 // does not have class , just to override
			 System.out.println("print B ");     // 9-15
		 }	
	};
	obj.show();
}
}
