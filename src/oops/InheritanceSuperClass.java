package oops;

class A {
	public A() {
		System.out.println("vikas");
	}

	public A(int i) {
		System.out.println("int");
	}

}

class B extends A
{
	public B() {
		super();
		System.out.println("vishal");
	}
	public B(int i) {
		super(i);
		System.out.println("int1");
	}
}

public class InheritanceSuperClass {
	public static void main(String[] args) {
		B obj = new B(5);
	}
}
