package com.vikas.vishal;

public class String2 {
	public static void main(String[] args) {
		String text = " jav is fun ";
		String[] result = text.split(" ");
		System.out.print("result = ");
		for (String str : result) {
			System.out.print(str + ", ");
			
		}

	}
}
