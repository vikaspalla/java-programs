package oops;
class Overide
{
public void show() {
	System.out.println("vishal");
}	
}
class Over extends Overide
{  // this class overrides above class, so that only vikas is shown not vishal
@Override
	
public void show() // the child class will override parent class

{  
	//super.show();      // BUT IF U WANT call parent class also use super.show();
	
	System.out.println("vikas");
}	
}
class C extends Overide
{
public void show() {
	System.out.println("C");
}	
}
public class MethodOverriding {
public static void main(String[]args) {
	Overide obj1 =new Over () ;  // RUN TIME POLYMORPHISM
			  obj1 = new C();
	//	Overide obj =new Over ();  // dynamic method
	obj1.show ();
	obj1.show(); // DYNAMIC METHOD DISPATCH
	
	
}
}
