package oops;
interface Semo 
{
	void abc();
	default void show() 
	{
		System.out.println("iam vikas ");
	}
}
interface MySemo 
{
	
	default void show() 
	{
		System.out.println("iam pallavikas ");
	}
}
class SemoImp implements Semo , MySemo 
{
	public void abc() 
	{
		System.out.println(" iam vishal ");
	}
	//public  void show() 
	//{
//		System.out.println("iam palla ");
	//}

	@Override                                 
	public void show() {
		// TODO Auto-generated method stub
		MySemo.super.show();
	}
	
}
public class MutlipleInheritanceIssueWithInterface {
public static void main(String[]args) 
{
	Semo obj = new SemoImp();
	obj.abc();
	obj.show();
}
}










