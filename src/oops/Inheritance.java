package oops;



class Calc {                             // super class or parent class , parent
	public int add(int i , int j ) {
		
		return  i+j ;
	}
}
class Calcadv extends Calc            // sub class or child class , child
{
	public int sub(int i , int j )
	{
		return i-j ;
	}
}
class Calcveryadvance extends Calcadv {
	public int mul(int i , int j)
	{
		return i*j ;
	}
}
public class Inheritance {
 public static void main(String[]args) {
	
	 Calcveryadvance obj = new Calcveryadvance();
	 int result1 =  obj.add(5,4);
	 int result2 = obj.sub(6,3);
	int result3 = obj.mul(4,5);
	
	System.out.println(result1);
	 System.out.println(result2);
	 System.out.println(result3);
 }
}
