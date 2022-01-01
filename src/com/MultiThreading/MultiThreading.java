package com.MultiThreading;
class Hi extends Thread
{
	public void show() 
	{
		for(int i = 1; i<=5 ; i++) 
		{
			System.out.println("Hi");
			try { Thread.sleep(500);} catch(Exception e ) {}
		}
	}
}
class Hello extends Thread
{
	public void show() 
	{
		for(int i = 1; i<=5 ; i++) 
		{
			System.out.println("Hello");
			try { Thread.sleep(500);} catch(Exception e ) {}

		}
	}
}
public class MultiThreading {
public static void main(String[]args) 
{
	Hi obj1 = new Hi();
	Hello obj2 = new Hello();
	
	obj1.show();
	obj2.show();
}
}

