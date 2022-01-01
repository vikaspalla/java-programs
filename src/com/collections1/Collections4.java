package com.collections1;

import java.util.HashSet;
import java.util.Set;

public class Collections4 {
public static void main(String[]args) 
{
    Set<Integer> values = new HashSet<>();
    
    values.add(5);
    values.add(6);
    values.add(7);
    values.add(5);     //set will have unique elements , so duplicate elements will not repeat
    for(int i : values)
    {
    	System.out.println(i);
    }

    
    
    
    
    
    
}
}
