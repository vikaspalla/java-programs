package com.collections1;

import java.util.ArrayList;

import java.util.List;

public class Collections1 {
	public static void main (String[]args) 
	{
		List<Integer> values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2, 2);  // by list --- we can give index and element 
	
		for(int i = 0 ; i<=values.size() ; i++ ) 
		{
			System.out.println(values.get(i));
		}
}
}