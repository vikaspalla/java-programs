package oops;







class Final1
{
	 final int i ;        // final is used to make value as constant 
	public  Final1() {
		i = 10;
	//   i = 15 ; if i make i = 15 ; it as constant so so it shows error
	}
	
	}
public class Final {
public static void main(String[]args) {
	Final1 obj = new Final1 ();
	// obj.Final1();
	System.out.println(obj.i);
}
}
// You can use final with varaibles , class ,methods 