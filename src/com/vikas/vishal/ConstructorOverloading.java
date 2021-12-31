package com.vikas.vishal;

public class ConstructorOverloading {
 public static void main(String[]args) {
	 Constructoroverload obj = new Constructoroverload(4,5, "add");
	 System.out.println(obj.num1);
 }
}
class Constructoroverload {
	int num1;
	int num2 ;
	String operation ;
	public Constructoroverload() {
		num1 =0 ;
		num2 = 0;
		String operation = "nothing" ;
	}
	public Constructoroverload(int i) {
		num1 =i ;
		num2 = 0;
		String operation = "nothing" ;
	}
	public Constructoroverload(int i , int j ) {
		num1 =i ;
		num2 = j;
		String operation = "nothing" ;
	}
	public Constructoroverload(int i , int j , String something) {
		num1 =i ;
		num2 = j;
		String operation = "vikas" ;


	}
}