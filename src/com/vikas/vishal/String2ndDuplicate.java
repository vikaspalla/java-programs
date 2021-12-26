package com.vikas.vishal;

public class String2ndDuplicate {
	public static void main(String[]args)
	{
	//String name = " my name is vikas ";
	//System.out.println(name);
	
		
		String result = "";
	String str = "beautiful beach";
	char[] ray = str.toCharArray();
	System.out.println("The string is:" + str);
	System.out.println("Duplicate Characters in above string are: ");
	for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	      if (ray[i] == ray[j]) {
	    	  result = result + ray[j];
	    	  System.out.println(ray[j]);
	    	  break;
	     
	      }
	   }
	}

	System.out.println(result);
		
		System.out.println(result.charAt(1));
		
}
}