package oops;

abstract class Human  // abstract class 
{
	public abstract void eat() ;
public void walk() 
    {
	System.out.println("vishal");
    }
}
class Man extends Human  // concrete class
{
	public  void eat() {
		System.out.println("vikas");
	}
}
public class Abstract {

	public static void main(String[] args) {
		
      Human obj = new Man();
	 obj.eat();
	}

}
