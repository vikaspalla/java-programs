package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectoinsandGenericsIretatorInterface1 {
	public static void main (String[]args) 
	{
		Collection values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		// System.out.println(values );
		Iterator it = values.iterator();  // by using iterator we can print certain values we required
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());
	while (it.hasNext()) 
	{
		System.out.println(it.next());
	}
	}
}
