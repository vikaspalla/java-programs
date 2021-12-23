package Assignments;

import java.util.Scanner;

public class TwinPrime {
	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the 1st number ");
		int num1 = sc.nextInt();
		System.out.println(" enter the second number ");
		int num2 = sc.nextInt();
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("numbers are twin prime");
			return;
		}
		for (int i = 2; i < num1; i++) {
			for (i = 2; i < num2; i++) {
				if (num1 % 2 != 0 && num2 % 2 != 0) {
					System.out.println(" numbers are twin prime ");
					return;
				} else {
					System.out.println(" not twin prime ");
					return;
				}

			}

		}

	}

}
