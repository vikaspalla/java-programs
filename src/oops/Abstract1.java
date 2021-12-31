package oops;

class Printer {
	public void show(Number i) // by usingnumber abstract we can reduce no of methods 
{
	System.out.println(i);	
}
	}

// Number is belongs to Abstact thats why it shows value 5.5 , 
// it cam take integer , double  , float aslo 





public class Abstract1 {
	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5.5) ;
	}
}
