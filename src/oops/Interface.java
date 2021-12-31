package oops;

abstract class Writer
{
	public abstract void write() ;
	
}




class Pen 
{
	public void write() 
	{
		System.out.println("iam a pen ");
	}
}
class Pencil 
{
	public void pencil() 
	{
		System.out.println("iam a pencil ");
	}
}
class Kit 
{
	public void doSomething(Writer p) 
	{
		
	//	System.out.println("fuck");
		p.write();
	}
}
public class Interface {

	public static void main(String[] args) {
		
             Kit k = new Kit();
          //   Writer p = new Pen() ;
           //  Writer pc = new Pencil(); 
             
         //    k.doSomething();
	}

}
