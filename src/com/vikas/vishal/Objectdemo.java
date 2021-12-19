
package com.vikas.vishal;

public class Objectdemo {
	public static void main(String... args) {

		Calc obj = new Calc(); // ref
		// obj = new Calc() ;
		obj.num = 3;
		obj.num1 = 5;
		obj.perform();
		System.out.println(obj.result);

	}
}

class Calc {
	int num;
	int num1;
	int result;

	public void perform() {
		result = num + num1;
	}
}
