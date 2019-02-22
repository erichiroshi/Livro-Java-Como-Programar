package capitulo_07.ex_7_20;

import java.util.Scanner;

public class Ex_7_20 {

	public static void main(String[] args) {

		double[][] sales = new double[6][5];

		Scanner input = new Scanner(System.in);

		for (int v = 0; v < 4; v++) {
			System.out.printf("Valores de venda para o vendedor %d%n", v + 1);

			for (int p = 0; p < 5; p++) {
				System.out.printf("Item %d:", p + 1);
				sales[p][v] = input.nextDouble();
				sales[5][v] += sales[p][v];
			}
			System.out.println();
		}

		for (int p = 0; p < 6; p++)
			for (int v = 0; v < 4; v++) {
				sales[p][4] += sales[p][v];
			}

		System.out.printf("       ");

		for (int v = 0; v < 5; v++) {
			if (v < 4)
				System.out.printf("%11s%d", "Vendedor ", v + 1);
			else
				System.out.printf("%12s", "Total");
		}

		System.out.println();

		for (int p = 0; p < 6; p++) {
			if (p < 5)
				System.out.printf("Item %d:", p + 1);
			else
				System.out.printf("Total :");
			for (int j = 0; j < 5; j++) {

				System.out.printf("%12.2f", sales[p][j]);

			}
			System.out.println();

		}

	}

}
