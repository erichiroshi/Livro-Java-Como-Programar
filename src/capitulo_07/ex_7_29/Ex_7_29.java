package capitulo_07.ex_7_29;

import java.util.Scanner;

class Ex_7_29 {

	public static void main(String[] args) {

		double f = 0;
		double aux = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite o enésimo número de Fibonacci");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.printf("%d - ", i);
			System.out.printf("%,.0f%n", f);

			f += aux;
			aux = f - aux;

		}
		input.close();
	}
}
