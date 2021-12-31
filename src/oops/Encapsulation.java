// encapsulation = binding data with methods

package oops;
class Student {
	
	private int roll ;
	private String name ;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Getters and Setters
}
public class Encapsulation {
public static void main(String[]args)
{
	Student s1 = new Student();
	s1.setRoll(1);
      s1.setName("vikas");
System.out.println(s1.getRoll());
System.out.println(s1.getName());



}
}
