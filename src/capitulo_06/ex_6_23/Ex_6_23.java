package capitulo_06.ex_6_23;

import java.util.Scanner;

public class Ex_6_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite 3 números reais");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		System.out.println("O menor dos três é: " + minimum3(a, b, c));

	}

	public static double minimum3(double a, double b, double c) {

		return (Math.min(a, Math.min(b, c)));

	}

}
