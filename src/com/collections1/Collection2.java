package com.collections1;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	public static void main (String[]args) 
	{
		List values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2, 2);  // by list --- we can give index and element 

	for (Object o : values )
	{
		System.out.println(o);
	}
	
	
	
	
	
	
	
	}
}