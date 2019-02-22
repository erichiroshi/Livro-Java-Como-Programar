package capitulo_06.ex_6_21;

import java.util.Scanner;

public class Ex_6_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Dígite um inteiro: ");
		int num = input.nextInt();

		System.out.println();
		displayDigits2(num);

	}

	public static int intQuociete(int a, int b) {

		return a / b;
	}

	public static int intResto(int a, int b) {

		return a % b;
	}

	public static void displayDigits2(int num) {

		int x = 1;

		while (intQuociete(num, x) != 0) {
			x *= 10;
		}

		for (int j = x / 10; j >= 1; j /= 10) {

			int esc = intQuociete(num, j);

			System.out.printf("%d  ", esc);

			num = intResto(num, j);

		}

	}
/*
	public static void displayDigits(int num) {

		int x = 1;

		for (int i = x / 10; i >= 1; i /= 10) {

			int pri = intQuociete(num, i);

			System.out.printf("%d  ", pri);

			num = num - pri * i;

		}

	}*/
}
