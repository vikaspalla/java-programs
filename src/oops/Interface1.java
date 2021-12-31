package oops;
     interface Bbc
{
	void show ();
}
 class Implementor implements Bbc 
{
public void show()
{
	System.out.println("anything");
}
	
		
	}
	

public class Interface1 {
public static void main(String[]args) 
{
	Bbc obj = new Implementor();
	obj.show();
}
}
