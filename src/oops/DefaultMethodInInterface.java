package oops;
// Absrtact - define and declare methods
// Interface - only declare methods -> 1.7 only
// 1.8-> can define methods
interface Demo 
{
	void abc();
	 default void show() 
	{
		System.out.println("iam vikas ");
	}
}
class DemoImp implements Demo 
{
	public void abc() 
	
	{
		System.out.println(" iam vishal ");
	}
}
public class DefaultMethodInInterface {
public static void main(String[]args) 
{
	
	}
}
