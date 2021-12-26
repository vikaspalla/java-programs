package com.vikas.array;

import java.util.Arrays;

public class ArrayGreater {
	public static void main(String[] args) {

		int d[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < d.length; i++) {
			int arr[] = new int[d.length];
			int count = 0;
			for (int j = 0; j < d.length; j++) {
				arr[count] = d[i][j];
				count++;
			}
			Arrays.sort(arr);
			System.out.println("Max number in the row : " + arr[arr.length - 1]);
		}

	}
}
