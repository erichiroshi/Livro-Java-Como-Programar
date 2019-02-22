package capitulo_05.ex_5_25;

import java.util.Scanner;

public class Ex_5_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int linhas;

		System.out.println("Informe qntas linhas tem o losango: ");
		linhas = input.nextInt();

		int met = linhas / 2 + 1;

		System.out.println(met);

		int aux = 1;
		int esp = met;

		for (int i = 1; i <= met; i++) {

			for (int j = 1; j <= esp; j++) {
				System.out.print(' ');
			}

			for (int j = 1; j <= aux; j++) {
				System.out.print('*');
			}

			System.out.println();

			aux += 2;
			esp--;
		}

		met = linhas / 2;
		aux = linhas - 2;

		for (int i = 1; i <= met; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(' ');
			}

			for (int j = 1; j <= aux; j++) {
				System.out.print('*');
			}
			System.out.println();

			aux -= 2;
		}

	}
}
