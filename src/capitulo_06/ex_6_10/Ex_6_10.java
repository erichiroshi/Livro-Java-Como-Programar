package capitulo_06.ex_6_10;

import java.util.Scanner;

public class Ex_6_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("dígite um número real");
		double num = input.nextDouble();

		System.out.println(roundToInteger(num));
		System.out.println(roundToTenths(num));
		System.out.println(roundToHundredths(num));
		System.out.println(roundToThousandths(num));

	}

	public static double roundToInteger(double number) {

		double y = Math.floor(number + 0.5);

		return y;
	}

	public static double roundToTenths(double number) {

		double y = Math.floor(number * 10 + 0.5) / 10;

		return y;
	}

	public static double roundToHundredths(double number) {

		double y = Math.floor(number * 100 + 0.5) / 100;

		return y;
	}

	public static double roundToThousandths(double number) {

		double y = Math.floor(number * 1000 + 0.5) / 1000;

		return y;
	}
}
