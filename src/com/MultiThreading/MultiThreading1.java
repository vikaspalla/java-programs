package com.MultiThreading;


	class Hii extends Thread
	{
		public void run() 
		{
			for(int i = 1; i<=5 ; i++) 
			{
				System.out.println("Hi");
				try { Thread.sleep(500);} catch(Exception e ) {}
			}
		}
	}
	class Heello extends Thread
	{
		public void run() 
		{
			for(int i = 1; i<=5 ; i++) 
			{
				System.out.println("Hello");
				try { Thread.sleep(500);} catch(Exception e ) {}

			}
		}
	}
	public class MultiThreading1 {
	public static void main(String[]args) 
	{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		
		obj2.start();
		obj1.show();
		obj2.show();
	}
}
