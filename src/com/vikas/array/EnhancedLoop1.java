package com.vikas.array;

public class EnhancedLoop1 {
	public static void main(String[] args) {

		int d[][] = { { 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {

				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
int sum =0 ;
		for (int k[] : d) {
			for (int l : k) {
			sum+=l ;	
							//	System.out.print(" " + l);
			}
			System.out.println(sum);

			
			System.out.println();
		}

	}
}
