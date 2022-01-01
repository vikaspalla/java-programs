package com.MultiThreading;
  class Hiii implements Runnable
{
	public void show() 
	{
		for(int i = 1; i<=5 ; i++) 
		{
			System.out.println("Hi");
			try { Thread.sleep(500);} catch(Exception e ) {}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
class Helloo implements Runnable
{
	public void show() 
	{
		for(int i = 1; i<=5 ; i++) 
		{
			System.out.println("Hello");
			try { Thread.sleep(500);} catch(Exception e ) {}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class MultiThreadingInterface {
	public static void main(String[]args) 
	{
		Hiii obj1 = new Hiii();
		Helloo obj2 = new Helloo();
		
		obj1.show();
		obj2.show();
}
}