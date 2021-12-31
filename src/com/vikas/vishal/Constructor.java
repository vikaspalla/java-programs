package com.vikas.vishal;

public class Constructor {
	public static void main(String[] args) {

		Calc1 obj = new Calc1();
		obj.perform(5,6);
		System.out.println(obj.num1);
	}
}

class Calc1 {
	int num;
	int num1;
	int result;

	public void perform(int number1 , int number2) {
		num = number1 ;
		num1 = number2 ;
	}
}