package com.collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	public static void main (String[]args) 
	{
		List values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2, 2);  // by list --- we can give index and element 
	Iterator it = values.iterator();
	while (it.hasNext()) 
	{
		System.out.println(it.next());
	}
			
			
		
	
		
		
		System.out.println();
		
}
}