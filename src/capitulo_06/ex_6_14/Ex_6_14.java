package capitulo_06.ex_6_14;

import java.util.Scanner;

public class Ex_6_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite um número e seu expoente");
		int base = input.nextInt();
		int exp = input.nextInt();

		System.out.println(integerPower(base, exp));

	}

	public static int integerPower(int base, int exponent) {

		int result = 1;

		for (int i = 1; i <= exponent; i++) {

			result *= base;
		}

		return result;

	}

}
