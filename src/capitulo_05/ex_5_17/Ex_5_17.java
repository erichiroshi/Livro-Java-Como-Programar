package capitulo_05.ex_5_17;

import java.util.Scanner;

public class Ex_5_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int prod, qnt;
		double total = 0;

		do {

			System.out.println("dígite o número do produto e a quantidade ou 0 0 para finalizar");
			prod = input.nextInt();
			qnt = input.nextInt();

			switch (prod) {
			case 1:
				total += 2.98 * qnt;
				break;
			case 2:
				total += 4.50 * qnt;
				break;
			case 3:
				total += 9.98 * qnt;
				break;
			case 4:
				total += 4.49 * qnt;
				break;
			case 5:
				total += 6.87 * qnt;
				break;
			}

		} while (prod !=0);

		System.out.printf("O Valor total é: %.2f", total);

		input.close();
	}

}
