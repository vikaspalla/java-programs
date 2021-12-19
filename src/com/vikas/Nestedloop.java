
package com.vikas;

public class Nestedloop {
	public static void main(String... args) {
		
		for(int i = 0; i<5; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println("In 2nd for loop");
			}
			System.out.println("Came out from 2nd for loop");
		}
	}
}
