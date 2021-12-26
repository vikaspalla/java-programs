package com.vikas.array;

public class ArrayGreater_2ndApproach {

	public static void main(String[] args) {

		int d[][] = { { 1, 5, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < d.length; i++) {
			int max = 0;
			for (int j = 0; j < d.length; j++) {
				if(max<d[i][j]) {
					max = d[i][j] ;

				}
			}
			
			System.out.println("Max number in the row : " + max);
		}

	}
}
