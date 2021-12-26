package com.vikas.vishal;

public class StringNotRepaeating {
	public static void main(String[] args) {

		String str = "vviiiishal";
		System.out.println("The string is:" + str);
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int temp = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					temp = 1;
					break;
				}
			}
			if (temp == 0) {
//				System.out.print(  str.charAt(i));
				result +=  str.charAt(i);
			}
		}
		System.out.println(result);
		System.out.println(result.charAt(0));
	}
}